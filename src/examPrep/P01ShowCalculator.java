package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class P01ShowCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double eposideLenght = Double.parseDouble(scanner.nextLine());

        double ads = eposideLenght * 0.20;
        double episodeWithAds = eposideLenght + ads;
        double standardEpisodes = seasons * episodes;
        double standardEpisodesTime = standardEpisodes * episodeWithAds;

        //double singleSpecialTime = eposideLenght + 10;
        double specialTime = seasons * 10;


        double totalTime = standardEpisodesTime + specialTime;



        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name, totalTime);


    }
}
