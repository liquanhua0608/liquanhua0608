package com.company;

public class hum {
    private  String  name ;
    private  int month;

    public void  show(){
        System.out.println("我叫:"+name+"我有多少钱:"+month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public hum() {
    }
    public hum(String name, int month) {
        this.name = name;
        this.month = month;
    }


}
