package com.company;

import java.util.ArrayList;

public class qinzhu extends hum{
    public qinzhu() {
    }

    public qinzhu(String name, int month) {
        super(name, month);
    }
    public ArrayList<Integer> send(int totaimonth,int shuliang){
        ArrayList<Integer> jihe =new ArrayList<>();

       int leftmonth= super.getMonth();

        if(totaimonth > leftmonth){
            System.out.println("余额不足");
            return  jihe;
        }

      super.setMonth(leftmonth-totaimonth);

        int man =totaimonth / shuliang;
        int mag =totaimonth % shuliang;

        for (int i = 0; i < shuliang-1; i++) {
            jihe.add(man);
        }
        int list =man+mag;
        jihe.add(list);
        return  jihe;



    }

}
