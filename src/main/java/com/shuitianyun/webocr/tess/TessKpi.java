package com.shuitianyun.webocr.tess;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TessKpi {
    public int countSuccess;
    public int countError;

    public void reportSuccess(){
        countSuccess++;
    }

    public void reportError(){
        countError++;
    }

    public double rateSuccess(){
        return countSuccess/(double)(countSuccess+countError);
    }

    @Override
    public String toString(){
        return String.format("成功率：%.2f;成功次数：%d；失败次数：%d；", rateSuccess(), countSuccess, countError);
    }
}
