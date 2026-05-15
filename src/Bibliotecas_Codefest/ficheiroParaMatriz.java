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

    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        String[] linhaSeparada = linha.split(delimitador);

        int contagemColunas = linhaSeparada.length;

        return contagemColunas;
    }

    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro, String delimitador, boolean hasHeader) throws FileNotFoundException {
        int numeroLinhas = contarLinhasFicheiro(caminhoFicheiro);

        if(hasHeader) numeroLinhas--;


        int numeroColunas = contarColunasFicheiro(caminhoFicheiro,delimitador);

        int linhaAtualMatriz = 0;
        String[][] matrizCompleta = new String[numeroLinhas][numeroColunas];

        Scanner sc = new Scanner(new File(caminhoFicheiro));
        if (hasHeader) sc.nextLine(); // a gente pula a linha do cabeçalho

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(delimitador);

            for (int i = 0; i < numeroColunas; i++) {
                matrizCompleta[linhaAtualMatriz][i] = linhaSeparada[i];
            }
            linhaAtualMatriz++;

        }
        return matrizCompleta;

    }
}
