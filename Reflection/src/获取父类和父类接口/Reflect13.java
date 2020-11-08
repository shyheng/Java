package 获取父类和父类接口;

/**
 * 重点。给你一个类，怎么获取这个的父类，已经实现了哪些接口
 */
public class Reflect13 {
    public static void main(String[] args)throws Exception {
//       Sting
        Class c = Class.forName("java.lang.String");

//        获取String的父类
        Class superclass = c.getSuperclass();
        System.out.println(superclass.getName());

//        获取String类实现的所有接口
        Class[] intfe = c.getInterfaces();
        for (Class in : intfe){
            System.out.println(in.getName());
        }
    }
}
