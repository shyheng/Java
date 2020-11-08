package Annotation1;

/**
 * 表示这个类已经过时
 *
 * @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
 *
 * 表示该注解可以出现在
 * 构造方法上，字段上，局部变量上，类上
 */
@Deprecated
public class Annotation3 {

    @Deprecated
    private int no;

    public static void main(String[] args) {
        Annotation3 at = new Annotation3();
        at.dos();
    }
@Deprecated
//这个注解，表示已过时，有更好的
//告诉其他程序员，只有提醒作用
    public void dos(){
        System.out.println("dss");
    }
@Deprecated
    public void over(){
        System.out.println("other");
    }
}
class T{
    public static void main(String[] args) {
        Annotation3 a= new Annotation3();
        a.dos();


        try {
            Class c = Class.forName("java.lang.String");
            Object s = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}