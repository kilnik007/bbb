package ru.mirea.task17;

enum Specialist {
    Lifting(400), Hairdresser(350), Masseur(450), Tattoo(300);
    private int price;
    Specialist(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
class EnumDem {
    public static void main(String[] args) {
        Specialist ap;
        ap = Specialist. Hairdresser;
        System.out.println("Значение ap: " + ap);
        System.out.println();
        ap = Specialist.Hairdresser;
        if (ap == Specialist.Hairdresser) System.out.println("Переменная ар содержит GoldenDel.\n");
        switch (ap) {
            case Lifting:
                System.out.println("вы записаны на лифтинг");
                break;
            case Hairdresser:
                System.out.println("вы записаны к парихмахеру");
                break;
            case Masseur:
                System.out.println("вы записаы к массажисту");
                break;
            case Tattoo:
                System.out.println("вы записаны на тату ");
                break;
        }
    }
}