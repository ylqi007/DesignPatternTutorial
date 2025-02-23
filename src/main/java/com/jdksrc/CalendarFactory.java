package com.jdksrc;

import java.util.Calendar;

public class CalendarFactory {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // getInstance 是 Calendar 静态方法
        Calendar cal = Calendar.getInstance();  // getInstance() 是 Calendar 的静态方法
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }
}
