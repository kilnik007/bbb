package ru.mirea.task4;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    private double s = 0.0;
    public Ball(){}
    public Ball(double x, double y, double s){
        this.x = x;
        this.y = y;
        this.s = s;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getS(){
        return s;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXYSPeed(double s){
        this.s = s;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+", "+this.s+").";
    }
}
