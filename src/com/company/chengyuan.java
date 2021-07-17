package com.company;

import java.util.ArrayList;
import java.util.Random;

public class chengyuan extends hum {
    public chengyuan() {
    }

    public chengyuan(String name, int month) {
        super(name, month);
    }
    public  void  shou(ArrayList<Integer> list){

        int index =new Random().nextInt(list.size());
        int dalte = list.remove(index);

        int month =super.getMonth();

       super.setMonth(month+dalte);
    }

}
