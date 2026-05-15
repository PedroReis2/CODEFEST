package CODEFEST_MENUS;

import java.io.FileNotFoundException;

import static Bibliotecas_Codefest.ficheiroParaMatriz.lerFicheiroParaMatriz;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        String[][] matrizAdmin = lerFicheiroParaMatriz("Files/Festival_Admin.csv", ";");
        String[][] matrizTickets = lerFicheiroParaMatriz("Files/Festival_Bilhetes.csv", ";");
        String[][] matrizLine = lerFicheiroParaMatriz("Files/Festival_Cartaz.csv", ";");
        String[][] matrizQuiz = lerFicheiroParaMatriz("Files/Festival_Quiz.csv", ";");
        Menu.menuLogin(matrizAdmin, matrizTickets);
    }


}
