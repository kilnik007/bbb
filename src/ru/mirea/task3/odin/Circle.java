package ru.mirea.task3.odin;

public class Circle {
    private double r;
    private double x0,y0;

    public Circle(double r, double x0, double y0) {
        this.r = r;
        this.x0 = x0;
        this.y0 = y0;
    }

    public double getR() {
        return r;
    }

    public double getX0() {
        return x0;
    }

    public double getY0() {
        return y0;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }
}
