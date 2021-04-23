package com.company;

public class Bank {
    private static final int maxTriesCount = 3;

    private class CardInfo {
        private  String cardId;
        private int pinCode;
        private int money;
        private int triesCount;// сколько раз ввели пин код неправильно

        // создание общего объекта

        public CardInfo (String cardId, int pinCode, int money){
            this.cardId = cardId;
            this.money = money;
            this.pinCode = pinCode;
        }
    }
    private CardInfo[] database;

    public Bank() {
        this.database = new CardInfo[] {
                new CardInfo("1212",1234, 500),
                new CardInfo("3434",5678, 600),
                new CardInfo("5656",9876, 700),
        };
    }

    public void signIn (String cardId, int pinCode) throws UnsupportedCardException, BlocCardException, IncorrectPinException {

        CardInfo card = getCardById(cardId); //метод getCardByInfo + эта запись заменяет закоментированный код
        //CardInfo card = null;
        /*for (CardInfo cardInfo : this.database) {
            if (cardInfo.cardId.equals(cardId)) {
                card = cardInfo;
                break;
            }*/


        if (card == null) {
            throw new UnsupportedCardException();
        }

        if(card.pinCode == pinCode) {
            card.triesCount = 0;
            return;
        }
        card.triesCount++;

        if (card.triesCount == maxTriesCount) {
            throw new BlocCardException();
        }
        throw new IncorrectPinException(maxTriesCount-card.triesCount);
        }


    private CardInfo getCardById(String cardId) {// метод проверяет совпадает ли ID карточки с базой
        for (CardInfo cardInfo : this.database) {
            if (cardInfo.cardId.equals(cardId)) {
                return cardInfo;
            }
        }
            return null;


    }

    public int whithDrawMoney  (String cardId, int m) throws NotManyException {
        //ищем карточку в базе по Id
        CardInfo card =getCardById(cardId);
        if (m > card.money) {
            throw new NotManyException ();
        }
        return card.money -= m;// card.monye = card.monye - m
    }

    public int getMoney (String cardId) {//  метод позволяет узнать остаток денег на карте
        CardInfo card = getCardById(cardId);
        return card.money;

    }
}
