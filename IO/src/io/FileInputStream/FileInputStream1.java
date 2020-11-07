package io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream;
 *  1文件字节输入流，万能的，任何类型的都可以采用这个流读
 * 2 节点的方法，完成输入的操作，完成读的操作（硬盘--》内存）
 * 3
 */
public class FileInputStream1 {
    public static void main(String[] args) {
//        创建文件字节输入对象
//        文件路径F:\自动办公软件\wry，idea会自动\\加
//        出现异常
        FileInputStream fis = null;
        try {
//            FileInputStream fis =new FileInputStream("F:\\自动办公软件\\wry");
//            写成/ 也可以，都是采用绝对路径的方式
            fis = new FileInputStream("F:\\自动办公软件\\shy.txt");

//            开始读
            int re = fis.read();//迭代器的nxte（）方法
            System.out.println(re);//119 w的

            re = fis.read();
            System.out.println(re);

            re = fis.read();
            System.out.println(re);

            re = fis.read();
            System.out.println(re);

            re = fis.read();
            System.out.println(re);

//读到文件的末尾了，在读，读不到，返回-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            关闭流，在finally 一定要关闭流，
            if (fis != null) {//避免空指针异常
//                关闭流的前提是，流表示空
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
