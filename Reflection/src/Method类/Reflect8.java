package Method类;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 了解内容
 *    反射Method
 */
public class Reflect8 {
    public static void main(String[] args) throws Exception{
//        获取类
        Class uer = Class.forName("Method类.user");

//        获取所有的方法
        Method[] methods = uer.getDeclaredMethods();
        System.out.println(methods.length);//2个方法

//        遍历Method
        for (Method m : methods){
//            获取方法名
            System.out.println(m.getName());

//            获取方法的返回值类型
            String s = m.getReturnType().getSimpleName();
            System.out.println(s);

//            获取修饰符列表
            System.out.println(Modifier.toString(m.getModifiers()));

//            一个方的修饰符（参数可能有多个）
            Class[] parameterTypes = m.getParameterTypes();
            for (Class para : parameterTypes){
                System.out.println(para.getSimpleName());
            }
        }
    }
}
