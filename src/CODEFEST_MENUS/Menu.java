package CODEFEST_MENUS;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static ADMIN.Case01.*;
import static ADMIN.Case02.*;
import static ADMIN.Case03.*;
import static ADMIN.Case04.*;
import static ADMIN.Case05.*;
import static ADMIN.Case06.*;
import static ADMIN.Case07.*;
import static ADMIN.Case08.*;
import static Attendee.Case01_00.*;

public class Menu {
    public static void menuAdmin(String[][] matrizAdmin, String[][] matrizTickets, String[][] matrizLine, String[][] matrizQuiz) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int option;
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
            System.out.println("0. Leave");

            System.out.print("Option: ");
            option = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.println("1. Info check");
                    checkFiles(matrizAdmin, matrizTickets, matrizLine, matrizQuiz);
                    break;

                case 2:
                    System.out.println("2. Total tickets sold");
                    totalTicketsSold(matrizTickets);
                    break;

                case 3:
                    System.out.println("3. Check attendees");
                    System.out.println("Insert attendee ID: ");
                    String idAttendee = input.next();
                    checkAttendee(matrizTickets, idAttendee);

                    break;

                case 4:
                    System.out.println("4. Most expensive ticket");
                    mostExpensive(matrizTickets);
                    break;

                case 5:
                    System.out.println("5. Best attendees");
                    mvAttendee(matrizTickets);
                    break;

                case 6:
                    System.out.println("6. Tickets per day");
                    System.out.println("Insert day of choice: "); //sexta, sábado ou domingo (sábado está errado, conferir com o professor)
                    String dayOfChoice = input.next();
                    dailyTicket(matrizTickets, dayOfChoice);
                    break;

                case 7:
                    System.out.println("7. Total value per ticket");
                    System.out.println("Insert ticket of choice: ");//VIP, backstage ou diário
                    String ticketType = input.next();
                    valuePerTicket(matrizTickets, ticketType);
                    break;

                case 8:
                    System.out.println("8. Total per day");
                    dailyTotal(matrizTickets);
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

    public static void menuClient(String[][] matrizAdmin, String[][] matrizTickets, String[][] matrizLine, String[][] matrizQuiz) throws FileNotFoundException {
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

            System.out.print("Option: ");
            option = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.println("1. New Attendee");
                    newAttendee();
                    break;

                case 2:
                    System.out.println("2. Camping Spots");
                    campingSpots();
                    break;
                case 3:
                    System.out.println("3. Line-up");
                    dailyLineUp(matrizLine);
                    break;

                case 4:
                    System.out.println("4. Stages");
                    allStages();
                    break;

                case 5:
                    System.out.println("5. Longest Concert");
                    longestShow(matrizLine);
                    break;

                case 6:
                    System.out.println("6. Daily Line-up");
                    input.nextLine(); //Limpar o buffer
                    System.out.println("Choose your day: (Sexta, Sábado or Domingo)");
                    String dayOfChoice = input.nextLine();
                    dailyLine(matrizLine, dayOfChoice);
                    break;

                case 7:
                    System.out.println("7. Line-up by Genre");
                    input.nextLine();
                    System.out.println("Which genre you're looking for? ");
                    String genreOfChoice = input.nextLine();
                    lineByGenre(matrizLine, genreOfChoice);
                    break;

                case 8:
                    System.out.println("8. Music quiz");
                    festivalQuiz(matrizQuiz);
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

    public static void menuLogin(String[][] matrizAdmin, String[][] matrizTickets, String[][] matrizLine, String[][] matrizQuiz) throws FileNotFoundException {
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
                    menuClient(matrizAdmin, matrizTickets, matrizLine, matrizQuiz);
                    break;

                case 2:
                    System.out.println("Name: ");
                    input.nextLine();
                    String nameAdmin = input.next();
                    System.out.println("Password: ");
                    String passAdmin = input.next();

                    boolean success = false;

                    for (int i = 0; i < matrizAdmin.length; i++){
                        if (matrizAdmin[i][0].equalsIgnoreCase(nameAdmin) && matrizAdmin[i][1].equalsIgnoreCase(passAdmin)){
                            success = true;
                            break;
                        }
                    }
                    if (success){
                        System.out.println("Login done successfully!");
                        menuAdmin(matrizAdmin, matrizTickets, matrizLine, matrizQuiz);
                    }else {
                        System.out.println("ERROR: Username or Password incorrect");
                    }
                    break;

                case 0:
                    System.out.println("0. Leave");
                    printCopyright();
                    break;

                default:
                    System.out.println("Invalid option: " + option);
                    break;
            }

        } while (option != 0);
    }

}
