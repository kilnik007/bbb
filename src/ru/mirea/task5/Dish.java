package ru.mirea.task5;

public abstract class Dish {
    String type,material;

    public Dish(String type, String material) {
        this.type = type;
        this.material = material;
    }
    public abstract void doPurpose();
}
