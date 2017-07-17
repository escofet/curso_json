package com.sopra.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonProc {
	public static void main(String[] args) throws IOException {
		Gson jsonObject = new Gson();
        File f = new File("json_example.json");
        FileReader fin = new FileReader(f);
        BufferedReader buf = new BufferedReader(fin);
        String line;
        StringBuilder sb = new StringBuilder();
        while((line = buf.readLine()) != null ) {
            sb.append(line);
        }
        buf.close();
        PersonJSON onePerson = jsonObject.fromJson(sb.toString(), PersonJSON.class);
        System.out.println(String.format("Name %s, Hobbies %s", onePerson.name, onePerson.hobbies));

        //Convertir a JSON
        Gson prettyJSON = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(prettyJSON.toJson(onePerson));
	}
}
