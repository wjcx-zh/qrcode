package com.wjcx.qrcode;

public class QRtest {
    public static void main(String[] args){
    	QRcodeHelper td = new QRcodeHelper();
        td.encoderQRCode("this is a test","d://123.jpg","jpg",12);
    }
}