package ru.mirea.task3.odin;

public class TestCircle {
    public static void main(String []args)
    {
        Circle circle=new Circle(15,0,1);
        System.out.println("Старые координаты центра: "+circle.getX0()+" "+circle.getY0());
        circle.setX0(100);
        circle.setY0(150);
        System.out.println("Старое значение радиуса: "+circle.getR());
        circle.setR(200);
        System.out.println("Новые значения центра и радиуса окружности: "+circle.getX0()+" "+ circle.getY0()+" "+circle.getR());
    }
}