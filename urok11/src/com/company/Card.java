package com.company;

public class Card {
    private String type;
    private String id;
    public Card (String type, String id) {
        this.type =type;
        this.id =id;
    }


    public String getType() {
        // обернуть в гетеры и сетеры alt+insert
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
