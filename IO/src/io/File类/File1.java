package io.File类;

import java.io.File;

/**
 *File
 *  1，File类和四大家族没有关系，File类不能完成文件的读和写
 *   2，File对象代表
 *     文件和目录路径名的抽象表达式
 *     一个File对象可能是文件或是目录路径
 *
 * 3，需要掌握File常用方法
 *
 */
public class File1 {
    public static void main(String[] args) throws Exception{
//        创建一个File对象
        File f = new File("F:\\shy");

//        判断是否存在
        System.out.println(f.exists());

//        如果不存在，那就以文件的创建出来,
     /*   if (!f.exists()){
//           以文件形式创建
            f.createNewFile();
        }*/

//     如果不存在，创建以目录的形式创建出来
   /*     if (!f.exists()){
//            以目录的形式创建
            f.mkdir();
        }*/


//   创建多重目录
        File f1 = new File("F:/a/b/c");
/*        if (!f1.exists()){
//           以多重目录来创建加s
            f1.mkdirs();
        }*/


//
        File f3 = new File("F:\\自动办公软件\\shy.txt");
//        获取文件的父路径
        String pPah = f3.getParent();
        System.out.println(pPah);

        File pds = f3.getParentFile();//一样
        System.out.println("获取绝对路径"+pds.getAbsolutePath());

        File f2 = new File("copy");
        System.out.println("绝对路径"+f2.getAbsolutePath());//F:\IO流\copy
    }
}
