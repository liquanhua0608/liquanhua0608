package com.Interface;

public class computer{
    public  void  powerON(){
        System.out.println("打开电脑");
    }
    public  void  powerOFF(){
        System.out.println("关闭电脑");
    }

    public  void usbfas(USB usb){
        usb.USBon();
        usb.USBoff();
    }
}
