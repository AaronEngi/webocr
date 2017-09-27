package com.shuitianyun.webocr.config;

import java.io.File;
import java.util.UUID;

public class DirBiz {
    public String getDirCaptcha(){
        //String path = this.getClass().getClassLoader().getResource("").getPath() + "/captcha";
        String path = "captcha";
        new File(path).mkdirs();
        return path;
    }

    /**
     * 随机的文件名，防止各个请求冲突
     * @return
     */
    public String getFileCaptcha(){
        //return getDirCaptcha() + "/t.png";
        return getDirCaptcha() + "/"+ UUID.randomUUID() + ".png";
    }
}
