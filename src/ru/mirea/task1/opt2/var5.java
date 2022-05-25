package ru.mirea.task1.opt2;
import java.util.Scanner;
public class var5 {

    public static int factorial(int a)
    {
        if (a < 0)
        {
            return a;
        }
        int result = 1;
        for (; a > 1; result *= a, a--) ;
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
}
