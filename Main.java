package com.pinkotterstudios;

import java.util.Scanner;

public class Main {
    private static long[] fibonacciCahce;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("Please enter a number under 93 to see the Fibonacci number for that value: ");
        n = scan.nextInt();

        fibonacciCahce = new long[n + 1];

        for(int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {

        if(n <= 1)
        {
            return n;
        }

        if(fibonacciCahce[n] != 0){
             return fibonacciCahce[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCahce[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
