package Attendee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Case01_08 {

    /* 1. Novo festivaleiro */
    public static void newAttendee(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Create your profile-----");

        System.out.println("-----Name:-----");
        String name = input.nextLine();

        System.out.println("-----Contact-----");
        String contact = input.nextLine();

        System.out.println("-----E-mail-----");
        String email = input.nextLine();

        System.out.println("-----Profile created successfully-----");
        System.out.println("-----" + name + "|" + contact + "|" + email + "-----");

    }

    /* 2. Campismo */
    public static void campingSpots(){
        int target = 300;
        int count = 0;
        int i = 1; /*começa em 1 pq são enumerados de 1 a 300*/

        System.out.println("-----Available camping spots:-----");
        while (true){ /*ciclo que nunca termina sozinho, mesmo após consultar o festivaleiro pode voltar ao menu para fazer nova pesquisa, pelo menos até inserir um valor válido*/
            count = (i * (i + 1)) / 2;
            if (count > target){
                break;
            }
            if (count % 5 == 0){
                System.out.println("-----The available spots are: " + count + "-----" );
            }
            i++;
        }
    }

    /* 3. Cartaz */
    public static void dailyLineUp(){

    }

    /* 4. Imprimir Palcos */
    public static void allStages(){

        Scanner input = new Scanner(System.in);

        System.out.println("-----STAGES-----");
        System.out.println("1. Main Stage");
        System.out.println("2. Java Stage");
        System.out.println("3. Commit Stage");

        System.out.print("-----Choose the stage you want to see----- ");
        int choice = input.nextInt();
        input.nextLine();

        String stageName = "";

        switch (choice) {

            case 1:
                stageName = "Files/Palco_Main.txt";
                break;

            case 2:
                stageName = "Files/Palco_Java.txt";
                break;

            case 3:
                stageName = "Files/Palco_Commit.txt";
                break;

            default:
                System.out.println("-----Invalid option "+ stageName + " does not exist-----");
                return;
        }
        try {   // Try-Catch usado para evitar que o programa pare caso o ficheiro .txt não exista
                // ou ocorra erro ao abrir o ficheiro do palco escolhido pelo utilizador.
            File stage = new File(stageName);
            Scanner sc = new Scanner(stage);
            System.out.println("-----" + stageName + "-----");

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (FileNotFoundException error){
            System.out.println("-----ERROR: " + stageName + " not found-----");
        }
    }

    /* 5. Concerto mais longo */

    /* 6. Cartaz diário */

    /* 7. Cartaz por genero*/

    /* 8. Quiz */
    public static void festivalQuiz(String[][] matrizQuiz){
        Scanner input = new Scanner(System.in);
        int points = 0;

        System.out.println("-----Try this quiz!!-----");

        for (int i = 0; i < matrizQuiz.length; i++) {

            System.out.println("Question " + (i + 1) + ":");
            System.out.println(matrizQuiz[i][0]); /*essas duas linhas mostram as 4 perguntas*/

            System.out.println("Question #1: " + matrizQuiz[i][1]);
            System.out.println("Question #2: " + matrizQuiz[i][2]);
            System.out.println("Question #3: " + matrizQuiz[i][3]);
            System.out.println("Question #4: " + matrizQuiz[i][4]);

            System.out.print("Answer: ");
            int userAnswer = input.nextInt();

            int correctAnswer = Integer.parseInt(matrizQuiz[i][5]);

            if (userAnswer == correctAnswer) {

                System.out.println("-----You got it right!-----");
                points++;

            } else {

                System.out.println("-----You know nothing Jon Snow!-----");

            }
        }
        System.out.println("\n-----This is the end of the road-----");
        System.out.println("\n-----Correct answers: " + points + "/" + matrizQuiz.length + "-----");

    }
}

