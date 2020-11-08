package 常用类.日期处理;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
    public static void main(String[] args) {
//        这个时间是什么时间
//1970-01-01 00:00:00 001
        Date ti = new Date(1);//注意：参数是一个毫秒,指定的毫秒数

        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String a = sfd.format(ti);
//        北京东八区，差8小时
        System.out.println(a);//1970-01-01 08:00:00 001

//        获取昨天的此时时间.
        Date ytime = new Date(System.currentTimeMillis()- 1000*60*60*24);
        String a1 = sfd.format(ytime);
        System.out.println(a1);

//        获取去年的今天
//        自己玩
    }
}
