package 常用类.基本数据类型包装类;
/*
经典异常
空指针异常NullPointerException
类型转换异常ClassCastException
数组下标越界异常ArrayIndexOutOfBoundsException
数字格式化异常NumberFormatException


* integer类中的常用方法
*intValue()
static int parseInt（String s）
* */
public class intger4 {
    public static void main(String[] args) {
//        手动装箱
        Integer x = new Integer(10);
//        手动拆箱
        int y = x.intValue();
        System.out.println(y);

//        编译器正常，运行时会出现  异常；数字格式化异常
//        Integer a =new Integer("中文");

//        重点方法
//        static int parseInt（String s）
//        静态方法，传参String 返回int
//        网页上输入的100实际上是“100”字符串。后台数据库要求存储100数字
//        需要将“100”转换成 100数字
        int re = Integer.parseInt("123");
//        int re = Integer.parseInt("中文");//出现异常NumberFormatException
        System.out.println(re+100);

//        照葫芦画瓢
        double re1 = Double.parseDouble("123");
        System.out.println(re1+1);//(精度问题)


//        了解
//        static String toBinaryString(int i)
//        将十进制转换二进制字符串
        String s = Integer.toBinaryString(45);
        System.out.println(s);//101101

//        static String toHexString(int i)
//        将十进制转十六进制。在toString()方法中return中
        String a = Integer.toHexString(100);
        System.out.println(a);//64

//        static String toOctalString(int i)
//        将十进制转八进制.
        String b= Integer.toOctalString(123);
        System.out.println(b);

//        valueOf（）方法  了解
//        static Integer valueOf（int i）
//静态的：int --》Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
//        String -->Integer
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);
    }
}
