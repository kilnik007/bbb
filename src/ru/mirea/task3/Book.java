package ru.mirea.task3;

public class Book {
    private String author;
    private String name;
    private int year;
    private int numberOfPage;
    private double salary;

    Book(String author, String name, int year, int numberOfPage, double salary) {
        this.author=author;
        this.name=name;
        this.year=year;
        this.numberOfPage=numberOfPage;
        this.salary=salary;
    }

    public void setSalary(double salary) {this.salary=salary;}
    public String getAuthor(){return author;}
    public int getYear(){return year;}
    public String toString(){
        return "name: "+this.name+", author: "+this.author+", year: "+this.year+", numberOfPage: "+
                this.numberOfPage+", salary: " +this.salary;
    }

}