package io.拷贝目录比较难;

import java.io.*;

/**
 * 拷贝目录
 */
public class Copyall {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();


//      拷贝源
        File srtF = new File("F:\\java算法排列");

//        拷贝目标
        File dest = new File("D:\\");

//        调用方法拷贝
        copyDir(srtF,dest);



        long b = System.currentTimeMillis();
        System.out.println("耗时"+(b-a));


    }
//拷贝目录的方法
    private static void copyDir(File srtF, File dest) {
        if (srtF.isFile()){
//           srtF是一个文件，递归结束
//            是文件的时候需要拷贝
//            进行拷贝，一边读，一边写

            FileInputStream in = null;
            FileOutputStream ou = null;

            try {
//                读文件
                in = new FileInputStream(srtF);
//                写文件
                String path = (dest.getAbsolutePath().endsWith("\\")? dest.getAbsolutePath():dest.getAbsolutePath()+"\\")+ srtF.getAbsolutePath().substring(3);
                ou = new FileOutputStream(path);

//                一边读，一边写
                byte[] bytes = new byte[1024*1024];//一次复制1MB
                int reda = 0;
                while ((reda = in.read(bytes)) != -1){
                    ou.write(bytes,0,reda);
                }

//                刷新
                ou.flush();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in  != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (ou != null) {
                    try {
                        ou.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            return;
        }
//        获取源文件的子目录
        File[] files = srtF.listFiles();
/*//        代码不要一直写要测试
        System.out.println(files.length);*/
//循环
        for (File file :files){

/*
//            获取所有文件的绝对路，径测试
//            System.out.println(file.getAbsolutePath());
*/

//新建对应的目录
            if (file.isDirectory()){

//                测试目录
//                System.out.println(file.getAbsolutePath());

//获取文件
                String srtDri = file.getAbsolutePath();
//                传入目标文件
                String destDir = (dest.getAbsolutePath().endsWith("\\")? dest.getAbsolutePath():dest.getAbsolutePath()+"\\")+ srtDri.substring(3);
                File newFiel = new File(destDir);
                if (!newFiel.exists()){
                    newFiel.mkdirs();
                }
            }

//            递归调用
            copyDir(file,dest);
        }
    }
}
