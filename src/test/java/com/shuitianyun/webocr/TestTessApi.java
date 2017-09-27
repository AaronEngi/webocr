package com.shuitianyun.webocr;

import com.shuitianyun.webocr.tess.TessApi;

import java.io.File;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TestTessApi {
    public static void main(String[] args){
        TessApi tessApi = new TessApi();
        File file = new File("E:/src/webocr/captcha/t.png");
        String result = tessApi.recognize(file);
        System.out.println("result:" + result);

//        file = new File("C:/Users/Administrator/Desktop/validCodeImage1.png");
//        result = tessApi.recognize(file);
//        System.out.println("result:" + result);
//
//        file = new File("C:/Users/Administrator/Desktop/validCodeImage2.png");
//        result = tessApi.recognize(file);
//        System.out.println("result:" + result);
//
//        file = new File("C:/Users/Administrator/Desktop/validCodeImage3.png");
//        result = tessApi.recognize(file);
//        System.out.println("result:" + result);
//
//        file = new File("C:/Users/Administrator/Desktop/validCodeImage4.png");
//        result = tessApi.recognize(file);
//        System.out.println("result:" + result);
    }
}
