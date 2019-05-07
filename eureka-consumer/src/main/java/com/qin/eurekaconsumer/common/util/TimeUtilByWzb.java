package com.qin.eurekaconsumer.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author WZB
 * @date 2019/5/7 22:57
 * @description 时间工具类
 * @version 1.0
 */
public class TimeUtilByWzb {

    /**
     *
     * @description 判断时间格式: yyyy-MM-dd
     */
    public static boolean isYyyyMMdd(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
                // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
                format.setLenient(false);
                format.parse(date);
                System.out.println(format.parse(date));
        } catch (ParseException e) {
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean yyyyMMdd = isYyyyMMdd("2018-2-30");
    }
}
