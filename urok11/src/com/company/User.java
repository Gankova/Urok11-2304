package com.company;

public class User {
    private Card moneycard; // карточка, каторая принадлежит юзеру

    public User() {}
    public User (Card card){
        this.moneycard = card;
    }

    public Card giveCard() { // c помощью метода пользователь достает карточку
        return  this.moneycard;
    }

    public void takeNewCard(Card newCard) { // метод выдает новую карточку взамен старой
        this.moneycard = newCard;
    }
}
