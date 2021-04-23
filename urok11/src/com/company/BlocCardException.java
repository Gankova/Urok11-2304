package com.company;

public class BlocCardException extends Exception {
    public BlocCardException(){
        super ("Ваша карта заблокировна. Обратитесь в банк");
    }
}
