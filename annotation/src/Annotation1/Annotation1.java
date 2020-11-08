package Annotation1;

/**
 * 1 注解，或者叫注释
 * 2 注解 Annotation是一种引用数据类型。编译后也是生成class文件
 * 3 怎么自定义注解 ？ 语法格式？
 *      [修饰符列表] @interface 注解类型名{
 *
 *      }
 *
 *      使用时的语法
 *     @注解类名
 *
 *     默认情况下，注解可以出现在任何地方
 *
 *
 *       掌握
 *      Deprecated 注释@Deprecated的程序元素是程序员不鼓励使用的程序元素，
 *      通常是因为它是危险的，或者因为存在更好的替代方法。
 *
 *      掌握
 *      Override 表示方法声明旨在覆盖超类型中的方法声明。
 *
 *      了解
 *      SuppressWarnings 表示在注释元素（以及注释元素中包含的所有程序元素）
 *      中应该抑制命名的编译器警告。
 */
@MyAnnotation1
public class Annotation1 {

    @MyAnnotation1
    private int no;

    @MyAnnotation1
    public static void m1 (){}

    @MyAnnotation1
    public Annotation1(){}

    @MyAnnotation1
    public void m2(@MyAnnotation1 String name,
                   @MyAnnotation1 int k){}

}


@MyAnnotation1
interface MyInger{}

@MyAnnotation1
enum Seas{
    SEAS,AAD,SDFA,SF,F
}