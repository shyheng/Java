package io.标准输出流;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *PrintStream，标准的字节输出流，默认输入到控制台
 *
 * 可以完成日志框架原理
 */
public class PrintStream1 {
    public static void main(String[] args)throws Exception {
        System.out.println("hello");

        PrintStream ps = System.out;
        ps.println("weor");
        ps.println("s");
//        标准输出流不需要关闭

//        可以改变标准输出流的输出方向
/*
这些是之前学过的System的方法和属性
        System.gc();
        System.currentTimeMillis();
        PrintStream ps1 = System.out;
        System.exit(0);
        System.arraycopy();
*/
//改变标准输出流的输出方向
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
//        标准输出流，不在指向控制台，指向log文件
        System.setOut(printStream);

//        以后的打印全部在log文件中
        System.out.println("wsdf");
        System.out.println("sadf");
        System.out.println("afds");

    }
}
