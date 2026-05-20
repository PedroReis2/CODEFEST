package Attendee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Case01_00 {

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
        System.out.println("-----" + name + " | " + contact + " | " + email + "-----");

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
    public static void dailyLineUp(String[][] matrizLine){
            String[] noRepeatArtist = new String[matrizLine.length];
            int count = 0;

            System.out.println("-----CODEFEST ARTISTS-----");

            for (int i = 0; i < matrizLine.length; i++) {
                String currArtist = matrizLine[i][4];
                boolean repeat = false;
                for (int j = 0; j < count; j++) {
                    if (noRepeatArtist[j].equalsIgnoreCase(currArtist)) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    System.out.println("-----" + currArtist + "-----");
                    noRepeatArtist[count] = currArtist;
                    count++;
                }
            }
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
    public static void longestShow(String[][] matrizCartaz) {

        int longest = 0;

        for (int i = 0; i < matrizCartaz.length; i++) {
            int duration = Integer.parseInt(matrizCartaz[i][6]);
            if (duration > longest) {
                longest = duration;
            } else if (duration == longest) {
                System.out.println(matrizCartaz[i][4] + " had the longest concert, that played " + matrizCartaz[i][5] +  " music, which took " + longest + " minutes, on " + matrizCartaz[i][1] + " at " + matrizCartaz[i][2] + "h, it took place on " + matrizCartaz[i][3]);
            }
        }
    }

    /* 6. Cartaz diário */
    public static void dailyLine(String[][] matrizTicket, String dayOfChoice) {

        System.out.println("-----Line of " + dayOfChoice.toUpperCase() + "-----");

        boolean found = false;

        for (int i = 0; i < matrizTicket.length; i++) {

            String day = matrizTicket[i][1];

            if (day.equalsIgnoreCase(dayOfChoice)) {

                found = true;

                String hour = matrizTicket[i][2];
                String stage = matrizTicket[i][3];
                String artist = matrizTicket[i][4];
                String genre = matrizTicket[i][5];
                String duration = matrizTicket[i][6];

                System.out.println(hour + " | " + stage + " | " + artist + " | " + genre + " | " + duration + " min");
            }
        }

        if (!found) {
            System.out.println("-----No concerts on: " + dayOfChoice + "-----");
        }
    }

    /* 7. Cartaz por genero*/
    public static void lineByGenre(String[][] matrizLine, String genreOfChoice) {

        System.out.println("-----Line by" + genreOfChoice.toUpperCase() + "-----");

        boolean found = false;

        for (int i = 0; i < matrizLine.length; i++) {

            String genre = matrizLine[i][5];

            if (genre.equalsIgnoreCase(genreOfChoice)) {

                found = true;

                String artist = matrizLine[i][4];
                String day = matrizLine[i][1];
                String hour = matrizLine[i][2];
                String stage = matrizLine[i][3];
                String duration = matrizLine[i][6];

                System.out.println(artist + " | " + day + " | " + hour + " | " + stage + " | " + duration + " min");
            }
        }

        if (!found) {
            System.out.println("-----No show by: " + genreOfChoice + "-----");
        }
    }

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

    /*COPYRIGHT*/
    public static void printCopyright() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Files/Festival_Copyright.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
    }


