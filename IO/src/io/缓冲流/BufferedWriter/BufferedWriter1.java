package io.缓冲流.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 * BufferedWriter
 *   带有缓冲的字符输出流
 */
public class BufferedWriter1 {
    public static void main(String[] args) throws Exception{
//        BufferedWriter ou = new BufferedWriter(new FileWriter("copy"));
//        BufferedWriter ou = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy")));
//        追加
        BufferedWriter ou = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
        ou.write("nb");
        ou.write("\n");
        ou.write("cao");
//刷新
        ou.flush();

        ou.close();
    }
}
