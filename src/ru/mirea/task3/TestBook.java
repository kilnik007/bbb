package ru.mirea.task3;

import java.util.Scanner;
public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("Joan Rolling", "Harry Potter",  2000, 601, 11.99);
        Book b2 = new Book("Sapkovsky", "Witcher",  1998, 356, 7.70);
        System.out.println(b1);
        Scanner in = new Scanner(System.in);
        double salary = in.nextInt();
        b2.setSalary(salary);
        System.out.println(b1);
    }
}
