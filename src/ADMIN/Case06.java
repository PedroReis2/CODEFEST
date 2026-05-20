package ADMIN;

public class Case06 {

    public static void dailyTicket(String[][] matrizTickets, String dayOfChoice){
        int count = 0;

        for (int i = 0; i < matrizTickets.length; i++){
            if (matrizTickets[i][5].equalsIgnoreCase(dayOfChoice)){
                count++;
            }
        }
        if (count > 0){
            System.out.println("-----There were a total of "+ count + " tickets sold on " + dayOfChoice + "-----");
        }else {
            System.out.println("-----There were no tickets sold on " + dayOfChoice + "-----");
        }
    }
}
