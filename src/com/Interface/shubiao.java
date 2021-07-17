package com.Interface;

public class shubiao implements USB{

    @Override
    public void USBon() {
        System.out.println("打开鼠标");
    }

    @Override
    public void USBoff() {
        System.out.println("关闭鼠标");

    }
}
