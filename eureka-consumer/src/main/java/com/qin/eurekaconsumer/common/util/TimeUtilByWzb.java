package com.qin.eurekaconsumer.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WZB
 * @date 2019/5/7 22:57
 * @description 时间工具类
 * @version 1.0
 */
public class TimeUtilByWzb {

    /**
     * 1
     * @description 判断时间格式: yyyy-MM-dd
     */
    public static boolean isYyyyMMddHyphenType(String date){
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

    /**
     * 2
     * @description 判断时间格式: yyyy-MM-dd HH:mm:ss  HH为24小时制
     */
    public static boolean isYyyyMMddHHmmssHyphenType(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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

    /**
     * 3
     * @description 判断时间格式: yyyy-MM-dd hh:mm:ss  hh为12小时制
     */
    public static boolean isYyyyMMddhhmmssHyphenType(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

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

    /**
     * 4
     * @description 判断时间格式: yyyy/MM/dd
     */
    public static boolean isYyyyMMddSlashType(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

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

    /**
     * 5
     * @description 判断时间格式: yyyy/MM/dd HH:mm:ss  HH为24小时制
     */
    public static boolean isYyyyMMddHHmmssSlashType(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

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

    /**
     * 6
     * @description 判断时间格式: yyyy/MM/dd hh:mm:ss  hh为12小时制
     */
    public static boolean isYyyyMMddhhmmssSlashType(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

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

    /**
     * 6
     * @description 判断时间格式: yyyy/MM/dd 'T' HH:mm:ss.Z  HH为24小时制
     */
    public static boolean isYyyyMMddHHmmssStandard(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd 'T' HH:mm:ss.SSSZ");

        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(date);
            System.out.println(format.parse(date));
            System.out.println(format.format(format.parse(date)));
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean flag = isYyyyMMddHHmmssStandard("2018/2/27 T 15:05:06.008+0800");
        System.out.println(flag);

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd 'T' HH:mm:ss.SSSZ");
        Date date=new Date();
        System.out.println(format.format(date));
    }
}
