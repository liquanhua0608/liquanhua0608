package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Random r =new Random();
//
//        for (int i = 0; i < 5; i++) {
//            int num = r.nextInt(10)+1; // 范围实际上是0~9
//            System.out.println(num);
//        }
//        int i=1;
//         i=i++;
//        int j=i++;
//       // int k=i + ++i * i++;
//        System.out.println("i="+i);
//        System.out.println("j="+j);
        //System.out.println("k="+k);
//        hum hum =new hum("小米",12);
//        System.out.println("姓名:"+hum.getName());
//        System.out.println("年龄:"+hum.getAge());
//


        

        qinzhu qinzhu =new qinzhu("群主",100);

        chengyuan one =new chengyuan("A",0);
        chengyuan two =new chengyuan("B",0);
        chengyuan three =new chengyuan("C",0);

        qinzhu.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==========");

        ArrayList<Integer> list =qinzhu.send(20,3);
        one.shou(list);
        two.shou(list);
        three.shou(list);
        qinzhu.show();
        one.show();
        two.show();
        three.show();
        ArrayList<Integer> list1=qinzhu.send( 50,3);
        one.shou(list1);
        two.shou(list1);
        three.shou(list1);
        qinzhu.show();
        one.show();
        two.show();
        three.show();












    }
}
