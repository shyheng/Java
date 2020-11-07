package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 完成文本文件的拷贝，利用FileReader + FileWriter
 * 只能拷贝普通文本文件
 */
public class wenbenCopy {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();

        FileReader re = null;
        FileWriter wr = null;

        try {
            re = new FileReader("src/io/wenbenCopy.java");
            wr = new FileWriter("wenbenCopy.java");

//            核心,一边读一边写
            char[] chars = new char[1024 * 512];//1MB
            int i = 0;
            while ((i = re.read(chars)) != -1){
                wr.write(chars,0,i);
            }

//            刷新，养成习惯
            wr.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (wr != null) {
                try {
                    wr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (re != null) {
                try {
                    re.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        long b = System.currentTimeMillis();
        System.out.println("用时"+(b-a));
    }
}
