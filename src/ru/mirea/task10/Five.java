package ru.mirea.task10;

import java.util.Scanner;

public class Five {

    static int sumDigits(int no)
    {
        return no == 0 ? 0 : no%10 +
                sumDigits(no/10) ;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumDigits(n));
    }

}
