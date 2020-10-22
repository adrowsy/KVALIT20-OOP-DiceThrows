/**
 * Dice contain three static methods and one constant value used in all methods.
 * Created by: Annika Rengfelt
 * Deadline: 2020-10-21
 */

import java.io.*;
import java.util.Scanner;

public class Dice {

    /**
     * Is used as a constant value of number of dices.
     */

    public static final int NUMBER_OF_DICES = 1000;

    /**
     * @return a file with values from six sided dices thrown {@value #NUMBER_OF_DICES} times.
     * @param fileName where to store results. Don't forget file ending (.txt, .csv)
     */

    public static void createFile(String fileName) {
        try (
                PrintWriter file = new PrintWriter(new FileWriter(fileName));
        ) {
            int min = 1;
            int max = 6;
            for (int i = 0; i < NUMBER_OF_DICES; i++) {
                file.print((int) (Math.random() * (max - min + 1) + min) + " ");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * @return array from file containing {@value #NUMBER_OF_DICES} int-values
     * @param fileName file containing values
     */

    public static int[] createArray(String fileName) {
        int[] array = new int[NUMBER_OF_DICES];
        try {
            Scanner scan = new Scanner(new File(fileName));
            for (int i = 0; i < NUMBER_OF_DICES; i++) {
                array[i] = scan.nextInt();
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        return array;
    }

    /**
     * @param array to be analysed
     * @return array with number of values 1 to 6
     */

    public static int[] analyseArray(int... array) {
        int[] values = new int[6];

        for (int i = 0; i < Dice.NUMBER_OF_DICES; i++) {
            int n = array[i];

            if (array[i] == n) ;
            values[n - 1] += 1;
        }
        return values;
    }
}