package ru.mirea.task10;

import java.util.Scanner;

public class Six {

    public static boolean checkPrime(int n) {
        return checkPrime1(n, 3);
    }

    public static boolean checkPrime1(int n, int currDivisor) {
        if (n < 2) {
            return false;
        }

        if (n % 2 == 0) {
            return (n == 2);
        }

        if (currDivisor * currDivisor > n) {
            return true;
        }

        if (n % currDivisor == 0) {
            return false;
        }

        return checkPrime1(n, currDivisor + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkPrime(num));
    }
}
