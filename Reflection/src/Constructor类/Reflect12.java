package Constructor类;

import java.lang.reflect.Constructor;

/**
 * 比上一个例子重要 11
 *
 *  通过反射机制调用构造方法实例化java对象
 */
public class Reflect12 {
    public static void main(String[] args)throws Exception{
//        不是反射机制怎么创建对象
        Vip a = new Vip();
        Vip b= new Vip(110,"zahng","22222",true);


//        使用反射机制创建对象
        Class c = Class.forName("Constructor类.Vip");
//        调用无参构造方法,用以下的无参
        Object obj = c.newInstance();


//        调用有参的构造方法
//        第一步获取到有参构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,boolean.class);
//        第二步调用构造方法
        Object newo = con.newInstance(122,"jaks","112",true);
        System.out.println(newo);

//        获取无参构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object newobj = con2.newInstance();
        System.out.println(newobj);
    }
}
