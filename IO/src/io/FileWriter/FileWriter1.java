package io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter
文件字符输出流
只能输出普通文本
 */
public class FileWriter1 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
//            创建文件字符输出流对象
//            out = new FileWriter("myout");
//            累加
            out = new FileWriter("myout",true);
//            开始写
            char[] chars = {'我','加','爱'};
            out.write(chars);
            out.write(chars,0,2);

            out.write("我很厉害");
            out.write("\n");
            out.write("换行符");

//            刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
