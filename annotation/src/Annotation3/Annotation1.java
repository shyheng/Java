package Annotation3;

/**
 * value属性很常用
 */
public class Annotation1 {
    @MyAnnotation(value = "shh")
    public void dao(){}

    @MyAnnotation("sss")//看见这个什么属性也不写，
    public void ou(){}
}
