package com.youxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Mian {
    public static void main(String[] args) {

        ArrayList<String> pokei =new ArrayList<>();

        String[] colors={"♠️","♥️","♣️","♦️"};
        String[] Number={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        pokei.add("大王");
        pokei.add("小王");

        for (String numders :Number){
            for (String color:colors){
                pokei.add(color+numders);
            }

        }
        //System.out.println(pokei);
        Collections.shuffle(pokei);
        //System.out.println(pokei);
        ArrayList<String> wanjia1 =new ArrayList<>();
        ArrayList<String> wanjia2 =new ArrayList<>();
        ArrayList<String> wanjia3 =new ArrayList<>();
        ArrayList<String> dipai =new ArrayList<>();

        for (int i = 0; i <pokei.size() ; i++) {
            String p = pokei.get(i);
            if (i>=51){
                dipai.add(p);

            }else if(i%3==0){
                wanjia1.add(p);
            }else if(i%3==1){
                wanjia2.add(p);
            }else if(i%3==2){
                wanjia3.add(p);
            }
        }

        System.out.println("刘德华"+wanjia1);
        System.out.println("周星驰"+wanjia2);
        System.out.println("张雨霏"+wanjia3);
        System.out.println("地主底牌"+dipai);




    }
}
