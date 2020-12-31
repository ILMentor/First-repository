package com.company.callback;

import javax.swing.*;
public class SomeClass {

    String replyTo;

    interface CallBack{
        void callingBack(String s);
    }

    CallBack callBack;

    public void registerCallBack(CallBack callBack){
        this.callBack = callBack;
    }

    public void doSomething(){
        int reply = JOptionPane.showConfirmDialog(null, "Is work in progress?", "Опрос", JOptionPane.YES_NO_OPTION);

        if( reply == JOptionPane.YES_OPTION)
            replyTo = "Да";
        if(reply == JOptionPane.NO_OPTION)
            replyTo = "Нет";
        callBack.callingBack(replyTo);
    }
}
