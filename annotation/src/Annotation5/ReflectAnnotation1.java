package Annotation5;

public class ReflectAnnotation1 {
    public static void main(String[] args) throws Exception{
//        获取类
        Class c = Class.forName("Annotation5.MyAnnotation1");
//        判断 类 上是否有 @MyAnnotation
//        System.out.println(c.isAnnotationPresent(MyAnnotation.class));
//true

        if (c.isAnnotationPresent(MyAnnotation.class)){
//            获取注解对象
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
//            System.out.println("上面类的注解对象"+myAnnotation);
//            获取注解对象属性，和调方法一样
            String v = myAnnotation.value();
            System.out.println(v);//默认方法，如果在类中定义，取类中的值
        }



//        判断String类是否有注解
        Class c1 = Class.forName("java.lang.String");
        System.out.println(c1.isAnnotationPresent(MyAnnotation.class));
//        false
    }
}
