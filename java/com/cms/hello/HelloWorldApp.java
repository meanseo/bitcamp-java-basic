package com.cms.hello;

import java.util.Scanner;

public class HelloWorldApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("Welcome id " + id + " pw " + pw + " name " + name);
    }
}
