package com.System;

import com.sun.tools.javac.util.List;

import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        come1();

        List<String> lsy = List.of("a", "b", "a");
        //System.out.println(lsy);
        lsy.add("w");
        System.out.println(lsy);



    }
    public  static  void come1(){

        //获取当前系统的毫秒值
        long s =System.currentTimeMillis();

        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);
        }
        long e =System.currentTimeMillis();
        System.out.println("需要多少:"+(e-s)+"毫秒");


    System.out.println("===============");


    //      数组的复制
    int[] se={1,2,3,4,5};
    int[] deng={6,7,8,9,10};
    System.out.println("复制前:"+ Arrays.toString(deng));
    // 数组： 索引 ， 数组：索引    长度
    System.arraycopy(se,0,deng,0,4);
    System.out.println("复制后:"+ Arrays.toString(deng));


    String li ="hi";
    StringBuilder den =new StringBuilder(li);
    den.append(" lihua");
    System.out.println(den);

   


    }
}
