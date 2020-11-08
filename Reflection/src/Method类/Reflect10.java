package Method类;

import java.lang.reflect.Method;

/**
 * 必须掌握，通过反射机制调用方法
 *
 * 反射机制，让代码具有通用性，可变化的内容都是写到配置文件当中
 * 将来修改配置文件之后，对象不一样，调的方法也不一样
 * 但是java代码不需要改动，在就是反射机制
 */
public class Reflect10 {
    public static void main(String[] args)throws Exception {
//        不使用反射机制，调用方法
//        创建对象
        user u = new user();
//        调用方法
        /**
         * 要素
         *  1 对象u
         *  2 login方法名
         *  3 实际实际参数列表
         *  4 返回值
         */
        boolean zhuang = u.login("admin","123");
//        System.out.println(zhuang);
        System.out.println(zhuang ? "登录成功":"登录失败");






//        使用反射机制
        Class usr = Class.forName("Method类.user");
//        创建对象
        Object obj = usr.newInstance();
//        获取Method
        Method log = usr.getDeclaredMethod("login", String.class, String.class);
//        Method log = usr.getDeclaredMethod("login", int.class);

//调用方法
//也是4要素
//        反射机制中很重要的方法
        /**
         * 要素
         *  1 对象obj
         *  2 log方法
         *  3 实际实际参数列表"admin","123"
         *  4 返回值 ret
         */
        Object ret = log.invoke(obj,"admin","123");
        System.out.println(ret);
    }
}
