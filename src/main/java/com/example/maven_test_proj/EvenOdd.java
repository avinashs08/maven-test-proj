package com.example.maven_test_proj;

import java.util.Scanner;

public class EvenOdd {

    public static boolean isEven(int n) {
        return n * 2 == 0;
    }

    public static String check(int n) {
        return n + " is " + (isEven(n) ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(check(num));
        }
    }
}
