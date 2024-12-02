package org.example.healthdiaryproject.service;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please choose an option:");
        System.out.println("1. Log in");
        System.out.println("2. Register");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // TODO CHOICE OMA SIIA ETTE!

        System.out.println("Teretulemast");

        System.out.print("Sisesta kasutajanimi: ");
        String username = scanner.nextLine();

        System.out.print("Sisesta parool: ");
        String password = scanner.nextLine();

        if (userService.login(username, password)) {
            System.out.println("Tere, " + username + "!");
        } else {
            System.out.println("Vale kasutajatunnus või parool. Palun proovi uuesti!");

            // TODO REGISTREERI NUPUKE SIIA?

        }
        scanner.close();
    }


}