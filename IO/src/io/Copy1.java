package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream + FileOutputStream完成文件拷贝
 * 拷贝的过程一边读，一边写
 * 使用以上的字节流拷贝的时候，文件类型随意，万能的，什么样的文件都能
 *
 */
public class Copy1 {
    public static void main(String[] args) {
       long a = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
//            创建一个输入流
            fis = new FileInputStream("src/io/FileInputStream/shy");
//        创建一个输出流
            fos = new FileOutputStream("myfile1");


//          核心，一边读一边写
            byte[] bytes = new byte[1024 * 1024];//1mb（一次拷贝1兆）
            int  rede = 0;
            while ((rede = fis.read(bytes)) != -1){
                fos.write(bytes,0,rede);
            }

//            刷新，输出流
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            分开try
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long b = System.currentTimeMillis();
        System.out.println("用时"+(b-a));
    }
}
