package ru.mirea.task4;

public class Author1
{
    private String name;
    private String email;
    private char gender;
    public Author1(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public char getGender()
    {
        return gender;
    }
    @Override
    public String toString()
    {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}