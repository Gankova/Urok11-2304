package com.company;

public class IncorrectPinException extends Exception{


    private int trieseCount;

    public IncorrectPinException(int trieseCount) {
        // вызываем коструктор родителя Эсепшн, конструктор родителя вызывается первой строкой
        super("Введен неверный пин-код");

        this.trieseCount = trieseCount;

    }

    public int getTrieseCount() {
        return trieseCount;
    }

}
