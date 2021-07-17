package com.Ction;

import java.util.HashSet;

public class Mian {
    public static void main(String[] args) {
        HashSet<String> li=new HashSet<>();
        String p1=new String("abc");
        String p2=new String("abc");
        li.add(p1);
        li.add(p2);
        li.add("打架");
        li.add("喝酒");
        li.add("abc");
        System.out.println(li);

        System.out.println("============");



        HashSet<Potion> set =new HashSet<>();
        Potion s1 =new Potion("小米",18);
        Potion s2 =new Potion("小米",18);
        Potion s3 =new Potion("小明",17);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        System.out.println("=======");


        int i = add(10,20);
        System.out.println(i);

    }

    public static int add(int... arr) {
        //System.out.println(arr.length);
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
