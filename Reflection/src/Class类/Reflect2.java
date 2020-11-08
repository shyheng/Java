package Class类;

import 验证反射机制的灵活性.user;

/**
 * 获取到Class，能干什么
 *    通过Class的newInstance()方法来实例化对象
 *    注意  newInstance()方法内部实际上调用了无参构造方法，必须保证无参构造才可以
 */
public class Reflect2 {
    public static void main(String[] args) {

        //这个不使用反射机制
//        缺点不灵活
        user u = new user();
        System.out.println(u);


//        复制S+C+A+c
        try {
//        通过反射机制，获取class，通过Class来实例化对象
            Class c =  Class.forName("验证反射机制的灵活性.user");//c代表user类型

//            newInstance()这个方法会调  无参数构造方法，完成对象的创建
//            重点 newInstance()方法调用的是无参构造，必须保证无参构造
            Object o = c.newInstance();

            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
