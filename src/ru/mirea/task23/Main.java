package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        String name;
        int yearOld;
        ArrayList<Dogs> doc = new ArrayList<>();
        doc.add(new Dogs("Vadick", 40, 543520));
        doc.add(new Dogs("Anton", 6, 148348));
        doc.add(new Dogs("Bob", 25, 223467));
        doc.add(new Dogs("Lebovskyi", 27, 300821));
        doc.add(new Dogs("Lugas", 26, 854034));
        System.out.println("введите имя питомца: ");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
        System.out.println("введите возраст питомца: ");
        yearOld=in.nextInt();
        boolean flag = false;

        Dogs d= new Dogs (name, yearOld, 0);
        for (int i = 0; i < doc.size(); i++) {
            if (d.hashCode() == doc.get(i).hashCode()) {
                System.out.println(doc.get(i).toString());
                flag=true;
            }
        }
        if (!flag) System.out.println("данного питомца не существует");
    }
}