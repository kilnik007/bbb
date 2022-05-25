package ru.mirea.task4;

public class TestAuthor1 {
    public static void main(String[] args)
    {
        Author1 a1 = new Author1("Den", "Den.@gmail.com", 'M');
        Author1 a2 = new Author1("Bob", "Bob.@gmail.com", 'M');
        System.out.println(a1.getName());
        System.out.println(a2.getName());
    }
}
