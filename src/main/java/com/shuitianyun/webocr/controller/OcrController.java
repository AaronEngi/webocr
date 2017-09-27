package com.shuitianyun.webocr.controller;

import cn.tyrael.library.http.DownloadTask;
import com.shuitianyun.webocr.config.DirBiz;
import com.shuitianyun.webocr.tess.TessApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class OcrController {
    /**
     * @param url 图片url
     * @return 识别的字符串
     */
    @RequestMapping(value="/captcha")
    public String recognizeCaptcha(String url){
        String local = new DirBiz().getFileCaptcha();
        new DownloadTask(url, local).run();
        //识别
        File file = new File(local);
        String result = new TessApi().recognize(file);
        file.delete();
        return result;
    }
}
