package io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
最终版本，需要掌握,重要
* */
public class FileInputStream4s {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/io/FileInputStream/shy");

//            准备一个byte数组
            byte[] bytes = new byte[4];
   /*         while (true){
                int read = fis.read(bytes);
                if (read == -1) {
                    break;
                }
//                把byte数组转成字符串，读到多少个，换成多少个
                System.out.print(new String(bytes,0,read));
            }
*/

              int read = 0;
              while ((read = fis.read(bytes))!= -1) {
                  System.out.print(new String(bytes,0,read));
              }


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
