package ru.mirea.task5;

public class Plate extends Dish {
    public Plate(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.print("Put smh");
    }
}