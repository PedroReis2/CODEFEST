package ADMIN;

import java.util.Scanner;

public class Case03 {

    public static void checkAttendee(String[][] matrizTickets, String idAttendee){

            String name = null;
            String contact = null;
            String mail = null;

            int totalTickets = 0;
            double tot = 0;

            System.out.println("----- Attendee -----");

            for (int i = 0; i < matrizTickets.length; i++) {

                if (matrizTickets[i][1] != null && matrizTickets[i][1].equals(idAttendee)) {


                    if (name == null) {
                        name = matrizTickets[i][2];
                        contact = matrizTickets[i][3];
                        mail = matrizTickets[i][4];
                    }

                    String day = matrizTickets[i][5];
                    String type = matrizTickets[i][6];
                    double price = Double.parseDouble(matrizTickets[i][7]);

                    System.out.println(" - Ticket: " + type);
                    System.out.println(" - Day: " + day);
                    System.out.println(" - Price: " + price + "€\n");

                    totalTickets++;
                    tot += price;
                }
            }
            if (name == null) {
                System.out.println("No attendee found with ID: " + idAttendee);
                return;
            }
            System.out.println("----- Attendee -----");
            System.out.println("\nName: " + name);
            System.out.println("Contact: " + contact);
            System.out.println("E-mail: " + mail);
            System.out.println("Tickets Bought: " + totalTickets);
            System.out.println("Total: " + tot + "€");
        }



    }
