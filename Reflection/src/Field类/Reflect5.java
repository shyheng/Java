package Field类;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射Student 中所有Filed
 */
public class Reflect5 {
    public static void main(String[] args) throws Exception{
//获取整个类
        Class Studentclass = Class.forName("Field类.Student");

        String s = Studentclass.getName();
        System.out.println("完整类名"+s);//Field.Student

        String s1=Studentclass.getSimpleName();
        System.out.println("简类名"+s1);//Field.Student

//        获取整个类中的所有的public修饰的Field
        Field[] fields = Studentclass.getFields();
        System.out.println(fields.length);

//        取出这个Filed
        Field f = fields[0];
//        取出Filed他的名字
        String ff =  f.getName();
        System.out.println(ff);
        System.out.println("=======");

//        获取所有的Field
        Field[] fs = Studentclass.getDeclaredFields();
        System.out.println(fs.length);//4
        System.out.println("=======");
//      遍历
        for (Field field : fs){
//            获取属性的名字
            System.out.println(field.getName());

//            获取属性的类型
            Class c = field.getType();
//            String type = c.getName();
            String type = c.getSimpleName();
            System.out.println(type);

//            获取属性的修饰符
            int i = field.getModifiers();
//            System.out.println(i);
//            返回的修饰符是一个数字，每一个数字是修饰符的代号
//            将这个数字转换字符串，调方法
            String mod = Modifier.toString(i);
            System.out.println(mod);
//            论英语的重要性
        }
    }
}
