package ru.mirea.task3;

public class Author {
    String name;
    String emale;
    char gender;

    void setEmale(String emale) {this.emale = emale;}

    String getName(String name) { return name;}
    String getEmale(String emale) {return emale;}
    char getGender(char gender){return gender;}


    Author(String n, String e, char g){
        name = n;
        emale = e;
        gender = g;
    }

    public String toString() {return name +"(" + gender + ")" + "at" + " " + emale;}
}
