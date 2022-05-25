package ru.mirea.task23;

import java.util.Objects;

public class Dogs {
    private String Name;
    private int yearsOld;
    private int ID;

    Dogs(String Name, int yearsOld, int ID){
        this.Name=Name;
        this.yearsOld=yearsOld;
        this.ID=ID;
    }
    @Override
    public int hashCode() {
        int result = Name == null ? 0 : Name.hashCode();
        result = 31 * result + yearsOld;
        return result;
    }
    public String toString(){
        return "Имя пёсика "+Name+", "+yearsOld+" лет, ID - "+ID+"\n";
    }
}
