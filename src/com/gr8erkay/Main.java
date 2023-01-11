package com.gr8erkay;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {

    //Complete this code or write your own from scratch

    public static void main(String[] argh) {

        HashMap<String, Integer> phoneDirectory = new HashMap<>();

        phoneDirectory.put("uncle sam", 99912222);
        phoneDirectory.put("tom", 11122222);
        phoneDirectory.put("harry", 12299933);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of the HashMap below: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Kindly input the name of person: ");
            String name = scanner.nextLine();
            System.out.println("Kindly input the corresponding phone number:");
            int phone = scanner.nextInt();
            scanner.nextLine();
            phoneDirectory.put(name, phone);
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (phoneDirectory.containsKey(s)){
                System.out.println(phoneDirectory.get(s));
            } else {
                System.out.println("Name not found");
            }

        }

        System.out.println(phoneDirectory.get("uncle sam"));
        System.out.println(phoneDirectory.containsKey("George"));
        System.out.println(phoneDirectory.containsValue(11122222));
    }
}


