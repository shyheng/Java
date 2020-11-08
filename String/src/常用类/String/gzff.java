package 常用类.String;
/*
* 关于String类的构造方法
* 第一个：String s = new String("");
* 第二个：String s = " ";最常用
* 第三个：String s = new String(char数组);
* 第四个：String s = new String(char数组,起始下标,长度);
* 第五个：String s = new String(byte数组);
* 第六个：String s = new String(byte数组,起始下标,长度);
*
* */
public class gzff {
    public static void main(String[] args) {


        //        创建字符串对象最常用的一中方式
        String s1 = "ha";
//        这里的s1保存的是一个内存地址
//        照说输出一个地址
//        但是输出一个字符串，说明String已经重写toString
        System.out.println(s1);


        //        这里只掌握常用的构造方法
        byte[] bytes = {97,98,99};//97是a，98是b，99是c
        String s2 = new String(bytes);
//        输出引用的时候，会自动调用toString（）方法。默认Object的话，会自动输出对象的内存地址
//       通过输出结果，得出String类已经重写了toString（）方法
//        输出字符串对象的话，输出的不是内存地址，而是字符串本身
        System.out.println(s2.toString());//abc
        System.out.println(s2);//abc


//String(字节数组，数组元素下标的起始位置，长度）
//        将byte数组中的一部分转换为字符串
        String s3 = new String(bytes,1,2);
        System.out.println(s3);//bc

//        将char数组全部转换成字符串
        char[] chars= {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);

//        将char数组的一部分装换为字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);

    }
}
