package com.Interface;

public class Mian {
    public static void main(String[] args) {
        computer computer=new computer();
        computer.powerON();
        shubiao shubiao =new shubiao();
        shubiao.USBon();
        shubiao.USBoff();
        USB usb =new jianpan();
        usb.USBon();
        usb.USBoff();
        computer.powerOFF();

        month(200);



    }




    public static void  month(double a){
        System.out.println(a);
    }
}
