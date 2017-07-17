package com.sopra.api;
/*
Get OS/VM environment and properties
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class SOEnv {
	public static void main(String[] args) throws IOException {
	    try(FileWriter fw = new FileWriter(new File("windows.properties"))) {
	        Map<String, String> env = System.getenv();
	        Properties props = System.getProperties();
	        Enumeration<Object> keys = props.keys();
	        Object keyElement;
	        StringBuilder sb = new StringBuilder("****************** Environment ******************\n");
	        for(String key : env.keySet()) {
	            sb.append(String.format("%40s = %s\n", key, env.get(key)));
	        }
	        sb.append("\n****************** Properties ******************\n");
	        while(keys.hasMoreElements()) {
	            keyElement = keys.nextElement();
	            sb.append(String.format("%40s = %s\n", keyElement, props.get(keyElement)));
	        }
	        fw.write(sb.toString());
	    }
	}
}
