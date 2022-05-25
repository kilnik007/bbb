package ru.mirea.task2;

public class Book {
    private String title;
    private int cost;
    public Book(String t, int c){
        title = t;
        cost = c;
    }
    public Book(String t){
        title = t;
        cost = 0;
    }
    public Book(){
        title = "Pup";
        cost = 0;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public int getCost() {
        return cost;
    }
    public String toString(){
        return this.title+", cost "+this.cost;
    }
    public void CostInDollars(){
        System.out.println(title+" cost in dollars "+cost*7+" dollars");
    }
}
