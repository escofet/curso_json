package com.sopra.api;

import java.util.Random;

public class AlphaNumPasswords {
	static final String alphaNONCAPS = "abcdefghijklmnopqrstuvwxyz";
    static final String alphas = alphaNONCAPS.concat(alphaNONCAPS.toUpperCase());
    static final String digits = "0123456789";
    static final String all = digits.concat(alphas); // 62 chars

    public static void main(String[] args) {
        Random rand = new Random();
        int minLength = 8;
        int passwordLength = rand.nextInt(all.length());
        if(passwordLength < minLength) {
        	passwordLength = minLength;
        }
        System.out.println(String.format("Password length %s", passwordLength));
        StringBuilder sb = new StringBuilder(passwordLength);
        for (int i = 0; i < passwordLength; i++) {
            sb.append(all.charAt(rand.nextInt(all.length())));
        }
        System.out.println(String.format("Password %s", sb));
    }
}