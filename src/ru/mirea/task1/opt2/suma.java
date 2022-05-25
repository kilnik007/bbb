package ru.mirea.task1.opt2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class suma {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("\n1- Сумма массива через цикл for. \n2- Сумма массива через цикл while. \n3- Сумма массива через цикл do while. ");
        int choice = sw.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов for");
                int summ = 0;
                Random m = new Random();
                int mas[] = new int[10];
                System.out.println("Случайный массив=");
                for (int i = 0; i < 10; i++) {
                    mas[i] = m.nextInt(50);
                    summ = summ + mas[i];
                    System.out.println(mas[i]);
                }
                System.out.println("Сумма чисел массива=" + summ);
                break;
            case 2:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов while");
                int Sum = 0;
                Scanner s = new Scanner(System.in);
                int[]a= new int[10];
                int i=0;
                System.out.println("Введите элементы массива");
                while ( i < 10) {
                    a[i]=s.nextInt();
                    Sum=Sum+a[i];
                    i++;
                }
                System.out.println("Сумма ="+Sum);
                break;
            case 3:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов do while");
                int summa=0;
                int q = 0;
                Random mm = new Random( 100);
                int mass[]= new int[10];
                System.out.println("Случайные элементы массива=");
                do {
                    mass[q]=mm.nextInt(100 );
                    System.out.println(mass[q]);
                    summa=summa+mass[q];
                    q++;
                } while (q <10);
                System.out.println("Сумма элементов массива ="+summa);
                break;
        }
    }

}
