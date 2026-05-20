package ADMIN;

public class Case04 {
    public static void mostExpensive (String[][] matrizTickets){
        double maxPrice = 0;
        for (int i = 0; i < matrizTickets.length; i++){
            double currValue = Double.parseDouble(matrizTickets[i][7]);
            if (currValue > maxPrice) {
                maxPrice = currValue;
            }
        }
        for (int i = 0; i < matrizTickets.length; i++) {
            double currValue = Double.parseDouble(matrizTickets[i][7]);

            if (currValue == maxPrice) {
                System.out.println("Date: " + matrizTickets[i][5]);
                System.out.println("Ticket type: " + matrizTickets[i][6]);
                System.out.println("This ticket is worth:" + currValue);
                break;
            }
        }
    }

}

