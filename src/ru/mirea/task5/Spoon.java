package ru.mirea.task5;

public class Spoon extends Dish {
    public Spoon(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.println("Eating smh");
    }
}
