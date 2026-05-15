package CODEFEST_MENUS;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static ADMIN.Case02.*;

public class Menu {
    public static void menuAdmin(String[][] matrizFestival, String[][] matrizTickets) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Admin CODEFEST -----");
            System.out.println("1. Info check");
            System.out.println("2. Total tickets sold");
            System.out.println("3. Check attendees");
            System.out.println("4. Most expensive ticket");
            System.out.println("5. Best attendees");
            System.out.println("6. Tickets per day");
            System.out.println("7. Total value per ticket");
            System.out.println("8. Total per day");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("1. Info check");
                    break;

                case 2:
                    System.out.println("2. Total tickets sold");
                    totalTicketsSold(matrizTickets);
                    break;

                case 3:
                    System.out.println("3. Check attendees");

                    break;

                case 4:
                    System.out.println("4. Most expensive ticket");

                    break;

                case 5:
                    System.out.println("5. Best attendees");

                    break;

                case 6:
                    System.out.println("6. Tickets per day");

                    break;

                case 7:
                    System.out.println("7. Total value per ticket");
                    break;

                case 8:
                    System.out.println("8. Total per day");
                    break;

                case 0:
                    System.out.println("0. Sair");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);

    }

    public static void menuClient(String[][] matrizFestival) {
        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Attendee  -----");
            System.out.println("1. New Attendee");
            System.out.println("2. Camping Spots");
            System.out.println("3. Line-up");
            System.out.println("4. Stages");
            System.out.println("5. Longest Concert");
            System.out.println("6. Daily Line-up");
            System.out.println("7. Line-up by Genre");
            System.out.println("8. Music quiz");
            System.out.println("0. Leave");

            System.out.print("Opção: ");
            option = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.println("1. New Attendee");

                    break;

                case 2:
                    System.out.println("2. Camping Spots");

                    break;
                case 3:
                    System.out.println("3. Line-up");
                    break;

                case 4:
                    System.out.println("4. Stages");
                    break;

                case 5:
                    System.out.println("5. Longest Concert");
                    break;

                case 6:
                    System.out.println("6. Daily Line-up");
                    break;

                case 7:
                    System.out.println("7. Line-up by Genre");
                    break;

                case 8:
                    System.out.println("8. Music quiz");
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

    public static void menuLogin(String[][] matrizFestival, String[][] matrizTickets) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Welcome to CODEFEST -----");
            System.out.println("1. Attendee");
            System.out.println("2. Admin");
            System.out.println("0. Leave");

            System.out.print("Option: ");
            option = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (option) {
                case 1:


                    break;

                case 2:
                    System.out.println("Name: ");
                    input.nextLine();
                    String nameAdmin = input.next();
                    System.out.println("Password: ");
                    String passAdmin = input.next();

                    boolean success = false;

                    for (int i = 0; i < matrizFestival.length; i++){
                        if (matrizFestival[i][0].equals(nameAdmin) && matrizFestival[i][1].equals(passAdmin)){
                            success = true;
                            break;
                        }
                    }
                    if (success){
                        System.out.println("Login done successfully!");
                        menuAdmin(matrizFestival, matrizTickets);
                    }else {
                        System.out.println("ERROR: Username or Password incorrect");
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
