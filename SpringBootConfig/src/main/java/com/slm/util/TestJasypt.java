package com.slm.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class TestJasypt {
    public static void main(String[] args){
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("123..123");
        String username = basicTextEncryptor.encrypt("1301218756");
        String password = basicTextEncryptor.encrypt("123..123");
        //第一次加密
        //QdJhwFBSX5pzX/PoAyzZ//jufL+kgyzZ
        //ebcFv+LZWheK4v8WgNFsimD2dG+tt589
        //第二次加密
        //8HBZhZM6/eoVYRCwy/kBg2hogO+BV2jL
        //qcxeV/72sAumwagFJ4eu1me4oJm+GToh
        System.out.println(username);
        System.out.println(password);
        username = basicTextEncryptor.decrypt(username);
        password = basicTextEncryptor.decrypt(password);
        System.out.println(username);
        System.out.println(password);
    }
}
