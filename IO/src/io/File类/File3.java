package io.File类;

import java.io.File;

/**
 * File中的listFile方法
 *    获取当前目录下的子文件
 */
public class File3 {
    public static void main(String[] args) {
//File[] listFile()
//        获取当前目录下的子文件
        File f = new File("F:\\java算法排列\\src\\排序");
        File[] f1 = f.listFiles();

//        遍历
        for (File s : f1){
            System.out.println(s.getAbsolutePath());
            System.out.println(s.getName());
        }
    }
}
