package io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输入流，负责写
 * 从内存到硬盘
 *
 */
public class FileOutputStream1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            myfile文件不存在会自动新建
//            这种方式谨慎使用，会将源文件清空，重写写
//            fos = new FileOutputStream("myfile");

//            以追加的方方式，写入源文件,注意，加载几次就追加几次
            fos = new FileOutputStream("src/io/FileInputStream/shy",true);
//开始写
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);//abcd
            fos.write(bytes,0,2);//abcdab

            String s = "我是一个 中国人";
//            将字符串装换为byte数组
            byte[] bs = s.getBytes();
            fos.write(bs);

            


//            写完以后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
