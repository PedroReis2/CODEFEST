package ADMIN;

import java.util.Scanner;

public class Case01 {
    public static void checkFiles(String[][] matrizAdmin, String[][] matrizTickets, String[][] matrizLine, String[][] matrizQuiz){
        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- CODEFEST Internal Info -----");
            System.out.println("1. Tickets");
            System.out.println("2. Line Up");
            System.out.println("3. Admin.Login");
            System.out.println("4. Quiz");
            System.out.println("0. Leave");

            System.out.print("Option: ");
            option = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.println("\n-----TICKETS-----");
                    for (int linha = 0; linha < matrizTickets.length; linha++) {
                        for (int coluna = 0; coluna < matrizTickets[0].length; coluna++) {
                            System.out.print(matrizTickets[linha][coluna] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("\n-----Line Up-----");
                    for (int linha = 0; linha < matrizLine.length; linha++) {
                        for (int coluna = 0; coluna < matrizLine[0].length; coluna++) {
                            System.out.print(matrizLine[linha][coluna] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n-----Admin.Login-----");
                    for (int linha = 0; linha < matrizAdmin.length; linha++) {
                        for (int coluna = 0; coluna < matrizAdmin[0].length; coluna++) {
                            System.out.print(matrizAdmin[linha][coluna] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("\n-----Quiz-----");
                    for (int linha = 0; linha < matrizQuiz.length; linha++) {
                        for (int coluna = 0; coluna < matrizQuiz[0].length; coluna++) {
                            System.out.print(matrizQuiz[linha][coluna] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("0. Leave");
                    break;

                default:
                    System.out.println("Invalid option: " + option);
                    break;
            }

        } while (option != 0);
    }

}


