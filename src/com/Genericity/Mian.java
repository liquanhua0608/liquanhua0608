package com.Genericity;

public class Mian {
    public static void main(String[] args) {
//        MyClass li =new MyClass();
//        li.den("hua");
        MyClass<Integer> li =new MyClass<>();
        li.den(12);
        MyClass<String> li2=new MyClass<>();
        li2.den("lihua");


        jie<Integer> li3 =new jie();
        li3.li(1);
    }
}
