package Class类;

import java.util.Date;

/**
 * 需要操作一个字节码，需要获取这类的字节码，怎么获取java.lang.Class实例
 *    三种方式
 *   第一种：Class c = Class.forName("完整类名带包名");
 *   第二种  Class C = 对象.getClass();
 *   第三种  Class c = 任何类型.class;
 */
public class Reflect1 {
    public static void main(String[] args) {

        /*
        第一种
        Class.forName()
        1 静态方法
        2 方法的参数是一个字符串
        3字符串需要一个完整的类名
        4 完整的类名必须带有包名，包名不能省略
        * */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        第二种，java中任何一个对象都有方法：getClass()
        String s = "abc";
        Class x = s.getClass();//x代表字节码文件，String类型
        System.out.println(c1 == x);//true (==表示对象地址是否相同)


        Date ti = new Date();
        Class y = ti.getClass();
        System.out.println(c2 == y);


//        第三种，java语言中任何一种类型，都有.class属性
        Class z = String.class;//z代表字节码文件，String类型
        Class k = Date.class;
        Class f = int.class;
        Class c = double.class;

        System.out.println(x == z);

    }
}
