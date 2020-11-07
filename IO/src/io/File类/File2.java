package io.File类;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class File2 {
    public static void main(String[] args) {
        File f = new File("F:\\自动办公软件\\shy.txt");
//       获取文件名
        System.out.println("文件名 "+ f.getName());

//        判断是否是一个目录
        System.out.println(f.isDirectory());//false

//        判断是否是一个文件
        System.out.println(f.isFile());//true

//        获取文件最后一次修改时间,返回毫秒数
        long haomiao =  f.lastModified();//这个毫秒数从1970年到现在的总毫秒数
//        将毫秒数转换成日期
        Date time = new Date(haomiao);
//        格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        导入
        String stime = sdf.format(time);
        System.out.println(stime);


//        获取文件大小
        System.out.println(f.length());//6字节

    }
}
