package Aud00;

// Да се испечатат бројот на парни и непарни броеви, како и нивната средна вредност за дадена низа од броеви.
// Print the number of even and odd numbers as well as their average from a given input integers.

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
//        with predefined array
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0, even = 0, odd = 0;
        Double average = 0.0;
//        with array given from input
        Scanner s = new Scanner(System.in);
        int n;
        n = Integer.parseInt(s.nextLine()); // reading full line and transforming String to Integer
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(s.nextLine()); // if all numbers are in separate lines for input
//            numbers[i] = s.nextInt();  //if all numbers are in the same line divided by space example 1 2 3
        }

        for (int number : numbers) {
            sum += number;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int arraySize = numbers.length;

        average = ((double) sum / (double) arraySize);

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Average:: " + average);
    }
}