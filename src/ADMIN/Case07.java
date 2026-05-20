package ADMIN;

public class Case07 {

    public static void valuePerTicket(String[][] matrizTickets, String ticketType){
        int quant = 0;
        double tot = 0;

        for (int i = 0; i < matrizTickets.length; i++){
            if (matrizTickets[i][6].equalsIgnoreCase(ticketType)){
                quant++;
                tot += Double.parseDouble(matrizTickets[i][7]);
            }
        }
        if (quant > 0){
            System.out.println("-----The " + ticketType + " was sold " + quant + " times, making a total of " + tot + "€-----");
        }else {
            System.out.println("-----There were no tickets found with the name: " + ticketType);
        }
    }
}
