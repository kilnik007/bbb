package ru.mirea.task3.tri;

public class HumanTest
{
    public static void main(String[] args)
    {
        Human human = new Human("Semen", 21, 'M', 120, 43);
        System.out.println(human);
        human.setIq(80);
        human.setName("Elena");
        human.setGender('F');
        human.setSizeLeg(38);
        human.setAge(24);
        System.out.println(human);
        System.out.println(human.getHand(true));
    }
}