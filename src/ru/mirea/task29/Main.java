package ru.mirea.task29;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo currencyInfo = new CurrencyInfo("RUB");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(currencyInfo);
        }

        try (
                FileInputStream fileInputStream = new FileInputStream("file.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            currencyInfo = (CurrencyInfo) objectInputStream.readObject();
        }
        System.out.println(currencyInfo);
    }

}