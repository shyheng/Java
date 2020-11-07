package io.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader:
 *  文本字符输入流，只能读取普通文本
 *    读取文本内容时，方便，快
 */
public class FileReader1 {
    public static void main(String[] args) {
        FileReader reda = null;
        try {
//            创建文件字符输入流
            reda = new FileReader("myfile1");
/*//            开始读
            char[] chars =new char[4];
            int rea = 0;
            while ((rea = reda.read(chars)) != -1){
                System.out.println(new String(chars,0,rea));
            }*/

//                可以对字符数组进行遍历
            char[] chars =new char[4];
//            往char数组中读
            reda.read(chars);//按照字符的方式来读取publ
            for (char c : chars){
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reda != null) {
                try {
                    reda.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
