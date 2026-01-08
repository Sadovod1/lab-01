package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    private Date date;
    public Sad(Date date){
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
