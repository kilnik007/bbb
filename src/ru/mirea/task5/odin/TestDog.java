package ru.mirea.task5.odin;

public class TestDog {
    public TestDog() {
    }

    public static void main(String[] args) {
        Dog chin = new Chin();
        Dog malinois = new Malinois();
        chin.bark();
        chin.size();
        System.out.println("\n");
        malinois.bark();
        malinois.size();
    }
}