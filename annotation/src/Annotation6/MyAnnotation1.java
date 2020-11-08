package Annotation6;

import java.lang.reflect.Method;

public class MyAnnotation1 {
    @MyAnnotation(usernema = "admin",pass = "123")
    public void doas(){}

    public static void main(String[] args)throws Exception {
//        获取MyAnnotation1的doas方法上面的注解信息
        Class c = Class.forName("Annotation6.MyAnnotation1");
//        获取daos方法
        Method doas = c.getDeclaredMethod("doas");
//        判断方法是否存在注解
        if (doas.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation =(MyAnnotation)doas.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.usernema());
            System.out.println(myAnnotation.pass());
        }
    }
}
