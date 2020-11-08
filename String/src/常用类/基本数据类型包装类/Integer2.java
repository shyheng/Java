package 常用类.基本数据类型包装类;
/*
* jdk1.5后，自动拆箱，装箱
*
* 自动装箱：基本数据类型自动转换为包装类
* 自动拆箱：包装类自动转换为基本数据类型
*
* 有了自动拆箱后 ，number类的方法用不到了
*
* 自动拆箱和自动装箱是为了方便编程
*
* */
public class Integer2 {
    public static void main(String[] args) {
//        自动装箱
        Integer x = 100;
//        自动拆箱
        int y = x;
        System.out.println(y);

        Integer z = 1000;
//z是引用，是一个变量，z还是保存了一个对象的内存地址
        //        要求两边是基本数据类型，z是包装类，这里会进行自动拆箱。转换为基本数据类型

        System.out.println(z+1);


        Integer a = 1000;//Integer a = new Integer(1000) a是一个引用，保存内存地址指向对象
        Integer b = 1000;//Integer b = new Integer(1000)b是一个引用，保存内存地址指向对象
//        ==比较内存地址，A和B两个引用的内存地址不同
//        ==不会触发自动拆箱机制（只有+-*/等才会出现）
        System.out.println(a == b);//false
    }
}
