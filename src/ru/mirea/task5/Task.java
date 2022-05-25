package ru.mirea.task5;

public class Task {
    public static void main(String[] args)
    {
        Pan pan=new Pan("Кухонная","Чугун");
        pan.doPurpose();
        Spoon spoon=new Spoon("Столовая","Алюминий");
        spoon.doPurpose();
        Plate plate=new Plate("Столовая","Керамика");
        plate.doPurpose();
    }
}