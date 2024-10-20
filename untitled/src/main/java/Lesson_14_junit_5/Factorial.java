package Lesson_14_junit_5;

import java.util.Scanner;

// Напишите программу, позволяющую вычислить факториал числа. Напишите юнит-тесты для этой программы, используя Junit 5.
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        System.out.print("Введи число для вычисления факториала: ");
        int number = scanner.nextInt();
        try {
            long fact = factorial.getFactorial(number);
            System.out.println("Факториал " + number + " = " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println("Число должно быть больше 0");
        }
    }

    public long getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть больше 0");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
