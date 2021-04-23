package com.company;

public class Main2{
    //пользователь может:
    // вставить карточку
    // ввести пин код
    //снять наличку

    //  Объект : банкомат, пользователь, карточка, банк

    public static void main(String[] args){
        Card visa = new Card("Visa","1212");
        User vasya = new User(visa);
        Bank bsb =new Bank();
        ATM atmbsb = new ATM(bsb);

        //
        atmbsb.insertCard(vasya.giveCard());
        try {
            atmbsb.showEnterPinCodeMenu();
        } catch (UnsupportedCardException | BlocCardException e) {
            System.out.println(e.getMessage());
            return;
        }

    }
}
