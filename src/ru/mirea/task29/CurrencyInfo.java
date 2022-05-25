package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {

    private final String isoCode;


    public CurrencyInfo(String isoCode) {
        this.isoCode = isoCode;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "isoCode='" + isoCode + '\'' +
                '}';
    }
}
