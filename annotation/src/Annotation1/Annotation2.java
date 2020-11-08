package Annotation1;

/**
 * 关于jdk 的Override注解
 * 源代码
 *   public @interface Override {
 *
 * }
 *
 * 标识性注解，给编译器做参考的
 * 编译器看到方法上的注解，编译器会自动检查方法是否重写父类方法
 *
 *  @Target 元注解， (ElementType.METHOD)，固定在哪个地方注解，方法上
 *
 *  eg @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
 *  @Retention 这是一个元注解 (RetentionPolicy.SOURCE) ，只被保留在什么地方，java中
 *
 *  eg  @Retention(RetentionPolicy.SOURCE)表示该注解只保存在java源文件中
 *  1   @Retention(RetentionPolicy.CLASS)表示该注解被保存在class文件中
 *  2   @Retention(RetentionPolicy.RUNTIME)表示给被保存在class文件中，并且可被反射机制所读取
 *
 */
//@Override只能注解方法
//@Override这个注解给编译器编译参考，和运行阶段没有关系
//凡是java中的方法带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写父类，编译报错
//    @Override//不能在类上，只能在方法上
public class Annotation2 {
//    @Override,也不能用在field上
    private int on;

    @Override
    public String toString() {
        return "Annotation1.Annotation2{}";
    }
}
