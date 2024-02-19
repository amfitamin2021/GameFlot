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

        fillPlayerField(playerField1);
        fillPlayerField(playerField2);

        
    }

    private static void fillPlayerField(char[][] playerField) {
        for (int i = 4; i >= 1; i--) {
            // растановка самих кораблей
            for (int k = i; k <= 5 - i; k++) {
                int q = 0;
                System.out.println("Расставляем " + i + "-палубный корабль. Осталось расставить: " + (q + 1));

                System.out.println("Введите x координату: ");
                int x = scanner.nextInt();

                System.out.println("Введите y координату: ");
                int y = scanner.nextInt();

                System.out.println("1 - горизонтально; 2 - вертикально ?");
                int position = scanner.nextInt();

                if (position == 1) {
                    for (q = 0; q < i; q++) {
                        playerField[y][x + q] = '1';
                    }
                }

                if (position == 2) {
                    for (int m = 0; m < i; m++) {
                        playerField[y + m][x] = '1';
                    }
                }

                printField(playerField);
            }
        }
    }

    static void printField(char[][] field) {
        for (char[] cells : field) {

            for (char cell : cells) {
                if (cell == 0) {
                    System.out.print(" |");
                } else {
                    System.out.print(cell + "|");
                }
            }
            System.out.println("");
            System.out.println("--------------------");
        }
    }
}