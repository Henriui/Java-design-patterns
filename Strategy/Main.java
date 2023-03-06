package Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an array.
        int[] randint;

        /*
         * BubbleSort
         */

        // Scramble the numbers.
        randint = scrambleNumbers();

        // Start timer.
        long startTime = System.currentTimeMillis();

        // Create a new instance of the BubbleSort class and call the sort method.
        ISort sort = new BubbleSort();
        sort.sort(randint);

        // Stop timer.
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time.
        System.out.println("BubbleSort took " + (endTime - startTime) + " milliseconds to sort the array.");

        /*
         * QuickSort
         */

        // Scramble the numbers.
        randint = scrambleNumbers();

        startTime = System.currentTimeMillis(); // record start time

        // Create a new instance of the QuickSort class and call the sort method.
        sort = new QuickSort();
        sort.sort(randint);

        endTime = System.currentTimeMillis(); // record end time

        // Calculate elapsed time.
        System.out.println("QuickSort took " + (endTime - startTime) + " milliseconds to sort the array.");

        /*
         * SelectionSort
         */

        // Scramble the numbers.
        randint = scrambleNumbers();

        startTime = System.currentTimeMillis(); // record start time

        // Create a new instance of the SelectionSort class and call the sort method.
        sort = new SelectionSort();
        sort.sort(randint);

        endTime = System.currentTimeMillis(); // record end time

        System.out.println("SelectionSort took " + (endTime - startTime) + " milliseconds to sort the array.");

    }

    private static int[] scrambleNumbers() {
        Random random = new Random();
        int[] randint = new int[10000];

        for (int i = 0; i < randint.length; i++)
            randint[i] = random.nextInt(999999999);

        return randint;
    }
}
