package org.example;

import java.util.Scanner;

public class Main {
    private static final int FILED_LENGTH = 10;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player 1, введите свое имя");
        String player1Name = scanner.nextLine();
        System.out.println("Hello, " + player1Name + "!");

        System.out.println("Player 2, введите свое имя");
        String player2Name = scanner.nextLine();
        System.out.println("Hello, " + player2Name + "!");


        char[][] playerField1 = new char[FILED_LENGTH][FILED_LENGTH];
        char[][] playerField2 = new char[FILED_LENGTH][FILED_LENGTH];

        char[][] playerBattleField1 = new char[FILED_LENGTH][FILED_LENGTH];
        char[][] playerBattleField2 = new char[FILED_LENGTH][FILED_LENGTH];

        
    }
}