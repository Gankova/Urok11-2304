package com.company;

public class UnsupportedCardException extends Exception {
    public UnsupportedCardException () {
        super("Ваша карта не поддерживается");
    }
}
