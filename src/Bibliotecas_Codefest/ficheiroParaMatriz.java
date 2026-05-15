package Bibliotecas_Codefest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ficheiroParaMatriz {//-------------------TRANSFORMAR O FICHEIRO EM MATRIZ
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (sc.hasNextLine()) {
            sc.nextLine();
            contagemLinhas++;
        }
        return contagemLinhas;
    }

    public static int contarColunasFicheiro(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        String[] linhaSeparada = linha.split(",");

        int contagemColunas = linhaSeparada.length;

        return contagemColunas;
    }

    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro, String delimitador) throws FileNotFoundException {
        int numeroLinhas = contarLinhasFicheiro(caminhoFicheiro) - 1;
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro);

        int linhaAtualMatriz = 0;
        String[][] matrizCompleta = new String[numeroLinhas][numeroColunas];

        Scanner sc = new Scanner(new File(caminhoFicheiro));

        sc.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine(); // a gente pula a linha do cabeçalho
            String[] linhaSeparada = linha.split(delimitador);

            for (int i = 0; i < numeroColunas; i++) {
                matrizCompleta[linhaAtualMatriz][i] = linhaSeparada[i];
            }
            linhaAtualMatriz++;

        }
        return matrizCompleta;

    }
}
