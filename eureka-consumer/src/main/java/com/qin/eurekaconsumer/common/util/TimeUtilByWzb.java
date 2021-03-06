package com.qin.eurekaconsumer.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
     * @description 判断时间格式: yyyy/MM/dd 'T' HH:mm:ssZ  HH为24小时制
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

    /**
     * 7
     * @description 判断两个日期的大小: yyyy-MM-dd
     * @param beginTime 开始时间
     * @param endTime 结束时间
     */
    public static boolean isInputTrueByMode1(String beginTime,String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            if (beginDate.getTime()>=endDate.getTime()){
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 8
     * @description 判断两个日期的大小: yyyy-MM-dd HH:mm:ss
     * @param beginTime 开始时间
     * @param endTime 结束时间
     */
    public static boolean isInputTrueByMode2(String beginTime,String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            if (beginDate.getTime()>=endDate.getTime()){
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 9
     * @description 判断两个日期的大小: yyyy/MM/dd 'T' HH:mm:ssZ  HH为24小时制
     * @param beginTime 开始时间
     * @param endTime 结束时间
     */
    public static boolean isInputTrueByMode3(String beginTime,String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd 'T' HH:mm:ss.SSSZ");

        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            if (beginDate.getTime()>=endDate.getTime()){
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 10
     * @description 获取时间段内的日期（每一天）: yyyy-MM-dd
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return List<Date> 开始时间到结束时间的日期
     */
    public static List<Date> getDateList(String beginTime, String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> dateList=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            calendar.setTime(beginDate);
            while (beginDate.getTime()<=endDate.getTime()){
                dateList.add(calendar.getTime());
                calendar.add(Calendar.DATE, 1);
                beginDate = calendar.getTime();
            }

        } catch (ParseException e) {
            return dateList;
        }
        return dateList;
    }

    /**
     * 11
     * @description 获取时间段内的日期字符串（每一天）: yyyy-MM-dd
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return List<String> 开始时间到结束时间的日期字符串
     */
    public static List<String> getStringDateList(String beginTime, String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        List<String> dateList=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            calendar.setTime(beginDate);
            while (beginDate.getTime()<=endDate.getTime()){
                dateList.add(format.format(calendar.getTime()));
                calendar.add(Calendar.DATE, 1);
                beginDate = calendar.getTime();
            }

        } catch (ParseException e) {
            return dateList;
        }
        return dateList;
    }

    /**
     * 12
     * @description 获取时间段内的日期（每一天）: yyyy-MM-dd HH:mm:ss
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return List<Date> 开始时间到结束时间的日期
     */
    public static List<Date> getDateListMode1(String beginTime, String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");

        List<Date> dateList=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            String beginDate2=format2.format(beginDate)+" 00:00:00";
            String endDate2=format2.format(endDate)+" 00:00:00";;
            beginDate= format.parse(beginDate2);
            endDate=format.parse(endDate2);
            calendar.setTime(beginDate);
            while (beginDate.getTime()<=endDate.getTime()){
                dateList.add(calendar.getTime());
                calendar.add(Calendar.DATE, 1);
                beginDate = calendar.getTime();
            }

        } catch (ParseException e) {
            return dateList;
        }
        return dateList;
    }

    /**
     * 13
     * @description 获取时间段内的日期字符串（每一天）: yyyy-MM-dd HH:mm:ss
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return List<String> 开始时间到结束时间的日期字符串
     */
    public static List<String> getStringDateListMode1(String beginTime, String endTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");

        List<String> dateList=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);

            Date beginDate= format.parse(beginTime);
            Date endDate=format.parse(endTime);
            String beginDate2=format2.format(beginDate)+" 00:00:00";
            String endDate2=format2.format(endDate)+" 00:00:00";;
            beginDate= format.parse(beginDate2);
            endDate=format.parse(endDate2);
            calendar.setTime(beginDate);
            while (beginDate.getTime()<=endDate.getTime()){
                dateList.add(format.format(calendar.getTime()));
                calendar.add(Calendar.DATE, 1);
                beginDate = calendar.getTime();
            }

        } catch (ParseException e) {
            return dateList;
        }
        return dateList;
    }

    public static void main(String[] args) {

        List<String> list=getStringDateListMode1("2019-05-01 13:40:30","2019-05-13 15:36:50");
        System.out.println(list);
    }
}
