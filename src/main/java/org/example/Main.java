package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player 1, введите свое имя");
        String player1Name = scanner.nextLine();
        System.out.println("Hello, " + player1Name + "!");

        System.out.println("Player 2, введите свое имя");
        String player2Name = scanner.nextLine();
        System.out.println("Hello, " + player2Name + "!");



    }
}