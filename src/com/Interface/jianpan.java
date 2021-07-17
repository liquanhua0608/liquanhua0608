package com.Interface;

public class jianpan implements USB{
    @Override
    public void USBon() {
        System.out.println("打开键盘");
    }

    @Override
    public void USBoff() {
        System.out.println("关闭键盘");
    }
}
