package com.company;

public class NotManyException extends Exception {
    public NotManyException () {
        super("Недостаточно денег не вашем счету");
    }

}
