package Annotation2;

public class Annotation1 {
//    报错，如果一个注解中有属性，那么必须给属性赋值
//    @MyAnnotation
//    @MyAnnotation(属性=属性值)

    @MyAnnotation(name = "zhang",age = 23)
//    所以
    @Deprecated(since = "9",forRemoval = true)
    public void dos(){}
}
