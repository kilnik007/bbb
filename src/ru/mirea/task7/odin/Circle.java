package ru.mirea.task7.odin;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        this.radius = 1.0D;
    }

    public double getArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius=" + this.radius + "}";
    }
}
