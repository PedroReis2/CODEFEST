package ADMIN;

public class Case02 {
    public static void totalTicketsSold (String[][] matrizTickets){
        int totalTickets = matrizTickets.length;

        double totalValue = 0;

        for (int i = 0; i < matrizTickets.length; i++){
            totalValue += Double.parseDouble(matrizTickets[i][7]);
        }
        System.out.println("----- Tickets Sold -----");
        System.out.println("Complete value of tickets sold: " + totalTickets);
        System.out.println("Total value: " + totalValue + "€");
    }
}
