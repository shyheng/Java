package io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)
 * 一次最多读取b.length 个字节
 * 减少硬盘和内存的交互，提高程序的执行效率
 *  往byte[]数组中读取
 */
public class FileInputStream3 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
//            相对路径，一定是从当前位置作为起点
//            idea默认的当前路径在哪才不会程序异常
//            工程project是idea默认的路径
            fis = new FileInputStream("src/io/FileInputStream/shy");

//            开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节
            byte[] bytes = new byte[4];

//            这个方法读取的是数量，不是字节本身  
            int reade = fis.read(bytes);
            System.out.println(reade);//第一次读到了4个字节
//            将字节数全部转换成字符串
//            System.out.println(new String(bytes));//wyrw
//不应该全部转换。一个是读取了多少个字节，装换多少个
            System.out.println(new String(bytes,0,reade));

            reade = fis.read(bytes);
            System.out.println(reade);//2  第二次只能读到2个字节
//            将字节数全部转换成字符串
//            System.out.println(new String(bytes));//anrw
            System.out.println(new String(bytes,0,reade));

            reade = fis.read(bytes); //没有读到什么，-1
            System.out.println(reade);//-1

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
