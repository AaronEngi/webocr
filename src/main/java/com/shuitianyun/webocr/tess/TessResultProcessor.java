package com.shuitianyun.webocr.tess;

import java.io.File;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TessResultProcessor {
    public String getCaptcha(File file){
        String tess = new TessApi().recognize(file);
        return tess.substring(0,3);
    }
}
