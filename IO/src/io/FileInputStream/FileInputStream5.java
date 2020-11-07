package io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream类的其他常用方法
 *     int available(); 返回流当中剩余的没有读到的字节数量
 *     long skip(long n); 跳过几个字节不读
 */
public class FileInputStream5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/io/FileInputStream/shy");

            System.out.println("总字节数量"+fis.available());
/*
//            读一个字节
            int red = fis.read();
//            还剩下可以读的字节数量
            System.out.println("还剩多少个"+fis.available());
//            这个方法用什么
            byte[] bytes = new byte[fis.available()];//不合适大文件，因为byte数组不能太大
//            不需要循环
//            一次就行
            int rr = fis.read(bytes);
            System.out.println(new String(bytes));
*/


//            skip 跳过几个字节不读取，这个方法也以后会用
            fis.skip(3);
            System.out.println(fis.read());//l  108



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
