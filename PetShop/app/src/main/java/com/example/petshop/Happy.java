package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    private Date date;
    public Happy(Date date){
        super(date);
    }

    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }
}
