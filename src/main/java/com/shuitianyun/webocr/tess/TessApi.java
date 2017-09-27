package com.shuitianyun.webocr.tess;

import cn.tyrael.library.log.LogAdapter;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TessApi {
    private static final String TAG = "TessApi";
    ITesseract instance = new Tesseract();
    private String trainDataPath;
    Log log = LogFactory.getLog(this.getClass());

    public TessApi() {
//        String path = "/home/bae/app/ROOT/";

        log.info("jna.library.path:" + System.getProperty("jna.library.path"));
        log.info("java.library.path:" + System.getProperty("java.library.path"));
        log.info("java.io.tmpdir:" + System.getProperty("java.io.tmpdir"));

        //String path = this.getClass().getClassLoader().getResource("").getPath();
        //String path = System.getProperty("java.io.tmpdir");
       // log.info(path);
//        try {
//            path = URLDecoder.decode(path, "utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        //instance.setDatapath(path);
    }

//    public void initDatapath(String path){
//        log.info(path);
//        trainDataPath = path;
//        instance.setDatapath(trainDataPath);
//    }

    public String recognize(File file){
        LogAdapter.d(TAG, file.getAbsolutePath());
        String result = null;
        try {
            result = instance.doOCR(file);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        return result;
    }
}

