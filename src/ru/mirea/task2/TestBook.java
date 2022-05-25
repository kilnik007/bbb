package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("War", 2);
        Book b2 = new Book("Peace", 7);
        Book b3 = new Book("Bob");
        b3.setCost(1);
        System.out.println(b1);
        b1.CostInDollars();
        b2.CostInDollars();
        b3.CostInDollars();
    }
}
