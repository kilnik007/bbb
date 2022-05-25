package ru.mirea.task5.odin;

public abstract class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog() {
    }

    public abstract void bark();

    public abstract void size();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
