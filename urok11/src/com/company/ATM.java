package com.company;

import java.util.Scanner;

public class ATM {
    private String cardId;

    private Bank bank;
    public ATM(Bank bank){
        this.bank = bank;
    }

    public void insertCard (Card card){
        // назначение метода запомнить ID карточку
        this.cardId = card.getId();
    }
    public void extractCard() {
        this.cardId ="";

    }
    public void showEnterPinCodeMenu() throws UnsupportedCardException, BlocCardException  {
        Scanner  sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите пин-код");
            int pinCode =sc.nextInt();
            try {
                bank.signIn(this.cardId, pinCode);
            } catch (IncorrectPinException e) {
                System.out.println(e.getMessage());// вернет тело метода IncorrectPinExceotion
                System.out.print("Осталось попыток: ");
                System.out.println(e.getTrieseCount());
                continue;
            }
            break;
        }

    }
}
