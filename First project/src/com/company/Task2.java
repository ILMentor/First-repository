package com.company;

public class Task2 implements CallBack {
    @Override
    public void callingBack(double a) {
        if (a == 15)
            System.out.println("Все верно.");
        else
            System.out.println("Ответ неверный.");
    }

    @Override
    public void callingBack(String s) {
        System.out.println("Use other callback.");
    }
}
