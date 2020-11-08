package 常用类.基本数据类型包装类;
/*
* 8种基本数据类型，有对应的8种包装类，8种包装类属于引用数据类型，父类是Object
*
* */
public class a {
//    入口
    public static void main(String[] args) {
//        调用shy（）方法的时候需要传一个数字进去
//        但是数字属于基本数据类型，而shy（）方法参数的类型是Object
//        可见shy（）方法无法接受基本数据类型的数字。可以传一个包装类

//        把100这个数字经过构造方法包装成对象
        myint m = new myint(100);
//        shy()方法虽然不能直接传100，但是可以传一个100对应的包装类型
        shy(m);

    }


    public static void shy(Object obj){
        System.out.println(obj);
    }
}
