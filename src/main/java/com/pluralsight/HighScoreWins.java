package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the game score:");
        String input=scanner.nextLine();

        String[] parts= input.split("\\|");
        String[] teams= parts[0].split(":");
        String[] scores=parts[1].split(":");

        int score1=Integer.parseInt(scores[0]);
        int score2=Integer.parseInt(scores[1]);


        if(!(score1==score2)) {
            System.out.print("Winner is " + ((score1 > score2) ? teams[0] : teams[1]));
        }
        else{
            System.out.println("it is a tie");
        }

    }
}
