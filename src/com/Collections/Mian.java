package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Mian {
    public static void main(String[] args) {
        ArrayList<Integer> p1 =new ArrayList<>();
        p1.add(1);
        p1.add(3);
        p1.add(2);
        Collections.sort(p1);
        System.out.println(p1);

        ArrayList<String> p2 =new ArrayList<>();
        p2.add("c");
        p2.add("b");
        p2.add("a");
        Collections.sort(p2);
        System.out.println(p2);


        ArrayList<pestion> p3=new ArrayList<>();
        p3.add( new pestion("战犯",49));
        p3.add( new pestion("李四",400));
        p3.add( new pestion("张三",30));

        Collections.sort(p3);
        System.out.println(p3);




    }
}
