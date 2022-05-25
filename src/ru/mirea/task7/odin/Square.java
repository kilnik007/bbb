package ru.mirea.task7.odin;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
        this.width = side;
    }

    public Square(double side, double length, String color, boolean filled) {
        this.width = side;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Square{width=" + this.width + ", length=" + this.length + ", color='" + this.color + "', filled=" + this.filled + ", side=" + this.side + "}";
    }
}