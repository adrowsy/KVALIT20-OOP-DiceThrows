/**
 * Assignment 2 in OOP for testers, Nackademin Kvalit20.
 * Created by: Annika Rengfelt
 * Deadline: 2020-10-21
 */
public class Main {

    public static void main(String[] args) {

        String fileName = "throws.txt";

        Dice.createFile(fileName);
        int[] diceThrows = Dice.createArray(fileName);
        int[] values = Dice.analyseArray(diceThrows);

        System.out.println("* RESULTAT *");
        for (int i = 0; i < values.length; i++) {
            System.out.println((i + 1) + ":or\t" + values[i]);
        }
    }
}
