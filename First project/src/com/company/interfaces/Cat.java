package com.company.interfaces;

import com.company.interfaces.Sound;

public class Cat implements Sound {


    @Override
    public String getType() {
        return null;
    }

    @Override
    public void getSound() {
        System.out.println("May");
    }

}
