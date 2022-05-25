package ru.mirea.task6;

public class TestDuck extends Duck {
    public TestDuck() {
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.getName();
        duck.sound();
    }
}
