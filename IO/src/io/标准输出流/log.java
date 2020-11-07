package io.标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 * 记录日志的方法
 *
 */
public class log {
    public static void log(String shijian){
        try {
//            指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
//            改变方向
            System.setOut(out);
//         日期当前时
            Date nowtime = new Date();
//            格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//            带入
            String srttiam = sdf.format(nowtime);
//           输出
            System.out.println(srttiam+":"+shijian);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
