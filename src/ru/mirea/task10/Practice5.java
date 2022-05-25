package ru.mirea.task10;

public class Practice5 {

    private static void isPrime(int number) {
        isPrime(number, 2);
    }

    private static void isPrime(int number, int div) {
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if (number % div == 0) {
            System.out.println("NO");
            return;
        }
        if (div > Math.sqrt(number)) {
            System.out.println("YES");
            return;
        }
        isPrime(number, div + 1);
    }
}
