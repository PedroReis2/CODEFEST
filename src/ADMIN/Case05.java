package ADMIN;

public class Case05 {

    public static void mvAttendee(String[][] matrizTickets) {

        double moneyXpent = 0;
        String bestClient = "";

        String[] noRepeatID = new String[matrizTickets.length];
        int totID = 0;

        for (int i = 0; i < matrizTickets.length; i++) {

            String currID = matrizTickets[i][2];
            boolean readID = false;

            for (int j = 0; j < totID; j++) {

                if (currID.equals(noRepeatID[j])) {
                    readID = true;
                    break;
                }
            }

            if (!readID) {

                double clientXpent = 0;

                for (int k = 0; k < matrizTickets.length; k++) {

                    if (matrizTickets[k][2].equals(currID)) {

                        clientXpent += Double.parseDouble(matrizTickets[k][7]);
                    }
                }

                if (clientXpent > moneyXpent) {

                    moneyXpent = clientXpent;
                    bestClient = currID;
                }

                noRepeatID[totID++] = currID;
            }
        }

        System.out.println("Best attendee: " + bestClient);
        System.out.println("Total spent: " + moneyXpent);
    }
}