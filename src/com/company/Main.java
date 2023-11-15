package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String word = "+447517784 1234-5678-01  +44751323784  +447517784 teachmeskills@gmail.ru 5324-5133-41 te0-achme_skills@teachmeskills0.com";
        Pattern patternDoc = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
        Pattern patternTel = Pattern.compile(" ?+(\\d{2}[\\d]{7})");
        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+");

        Matcher matcherDoc = patternDoc.matcher(word);
        Matcher matcherTel = patternTel.matcher(word);
        Matcher matcherEmail = patternEmail.matcher(word);

        if (matcherDoc.find()) {
            System.out.println("Doc: ");
            matcherDoc.reset();
        }
        while (matcherDoc.find()) {
            System.out.print(matcherDoc.group() + " ");
        }

        if (matcherTel.find()) {
            System.out.println();
            System.out.println("Tel:");
            matcherTel.reset();
        }
        while (matcherTel.find()) {
            System.out.print(matcherTel.group() + " ");
        }

        if (matcherEmail.find()) {
            System.out.println();
            System.out.println("Email:");
            matcherEmail.reset();
        }
        while (matcherEmail.find()) {

            System.out.print(matcherEmail.group() + " ");
        }
    }
}