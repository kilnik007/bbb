package ru.mirea.task10;

import java.util.Scanner;

public class Seven {
    public static void factorial(int n, int k)
    {
        if (k > n ) return;
        if(n % k == 0) {
            System.out.println(k);
            while(n%k==0)
            {
                n=n/k;
            }
        }

        factorial(n,k+1);
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n;
        n=inp.nextInt();
        factorial(n,2);
    }
}
