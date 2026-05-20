package ADMIN;

public class Case08 {
    public static void dailyTotal(String[][] matrizTickets){
        int dailyFri = 0;
        int dailySat = 0;
        int dailySun = 0; //bilhetes por dia serão guardados para fazer a conta mais a frente

        double grossFri = 0;
        double grossSat = 0;
        double grossSun = 0; //total de vendas por dia para saber a receita total do dia

        for (int i = 1; i < matrizTickets.length; i++){ //dessa vez comecamos em 1 pq nao contamos o cabeçalho
            String day = matrizTickets[i][5];
            Double tot = Double.parseDouble(matrizTickets[i][7]);
            if (day.equalsIgnoreCase("sexta")){
                dailyFri++;
                grossFri += tot; //soma do valor do bilhete e a quantidade vendida por dia
            } else if (day.equalsIgnoreCase("sabado") || day.equalsIgnoreCase("sábado")) {
                dailySat++;
                grossSat += tot;
            }else if (day.equalsIgnoreCase("domingo")) {
                dailySun++;
                grossSun += tot;
            }
        }

        System.out.println("-----On friday there were " + dailyFri + " tickets sold, being a total of " + grossFri + " €-----");
        System.out.println("-----On saturday there were " + dailySat + " tickets sold, being a total of " + grossSat + " €-----");
        System.out.println("-----On sunday there were " + dailySun + " tickets sold, being a total of " + grossSun + " €-----");
    }
}
