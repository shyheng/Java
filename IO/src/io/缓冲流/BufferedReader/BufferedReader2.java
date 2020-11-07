package io.缓冲流.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
InputStreamReader转换流
 */
public class BufferedReader2 {
    public static void main(String[] args) throws Exception{


/*

//       字节流
        FileInputStream in = new FileInputStream("wenbenCopy.java");
//        这个构造方法只能传一个字符流。不能传字节流
//        通过转换流转换,将字节流转换成字符流
//in是节点流，reda是包装流
        InputStreamReader reda = new InputStreamReader(in);
//reda是节点流，br是包装流
        BufferedReader br = new BufferedReader(reda);
*/

//合并,套娃
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("wenbenCopy.java")));



        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

//        关闭最外层
        br.close();

    }
}
