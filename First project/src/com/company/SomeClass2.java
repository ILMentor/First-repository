package com.company;

import com.company.callback.SomeClass;

public class SomeClass2 {
    private double a, b;
    void doSomething(double a, double b){
        this.a = a;
        this.b = b;
        System.out.println(a * b);

    }
    void callingBack(CallBack cl){
        cl.callingBack(a*b);
    }
}
