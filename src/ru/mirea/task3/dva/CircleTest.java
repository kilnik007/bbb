package ru.mirea.task3.dva;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1);
        System.out.println(c1.getLength());
        System.out.println(c1);
        Circle c2 = new Circle(3, "yellow");
        c2.setColor("green");
        System.out.println(c2);
    }
}