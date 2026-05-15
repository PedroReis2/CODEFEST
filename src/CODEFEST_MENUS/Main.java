package CODEFEST_MENUS;

import java.io.FileNotFoundException;

import static Bibliotecas_Codefest.ficheiroParaMatriz.lerFicheiroParaMatriz;
import static CODEFEST_MENUS.Menu.menuLogin;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        String[][] matrizAdmin = lerFicheiroParaMatriz("Files/Festival_AdminLogin.csv", ";", false);
        String[][] matrizTickets = lerFicheiroParaMatriz("Files/Festival_Bilhetes.csv", ";", true);
        String[][] matrizLine = lerFicheiroParaMatriz("Files/Festival_Cartaz.csv", ";", true);
        String[][] matrizQuiz = lerFicheiroParaMatriz("Files/Festival_Quiz.csv", ";", true);


        menuLogin(matrizAdmin, matrizTickets, matrizLine, matrizQuiz);
    }


}
