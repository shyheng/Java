package io.缓冲流.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader
 *  带有缓冲区的字符输入流
 *   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲
 *   方便写代码
 */
public class BufferedReader1 {
    public static void main(String[] args) throws Exception{
        FileReader read = new FileReader("wenbenCopy.java");
//       当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
//        外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流
//        像当前这程序来说FileReader是一个节点流，BufferedReader就是包装流、处理流
        BufferedReader br = new BufferedReader(read);//节点流

/*
//        都一行
        String firs = br.readLine();
        System.out.println(firs);

//       在来一次
        System.out.println(br.readLine());//空白

//        第三行
        System.out.println(br.readLine());
*/

//循环
//        br.readLine()读取，不带换行符
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
//        关闭流
//        对于包装流来说，只需要关闭最外层的流，源代码里面的自己关了
        br.close();
    }
}
