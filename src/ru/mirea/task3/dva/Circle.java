package ru.mirea.task3.dva;

import java.math.*;
public class Circle
{
    private double radius;
    private String color;
    public Circle() {
        radius = 3.0;
        color = "purple";
    }
    public Circle(double radius)
    {
        this.radius = radius;
        color = "purple";
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getLength() {
        return 2.0*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "Circle "+"radius="+radius+" | color=\""+color+"\"";
    }
}
