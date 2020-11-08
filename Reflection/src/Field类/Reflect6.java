package Field类;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制，反编译 一个类的属性Field(了解)
 */
public class Reflect6 {
    public static void main(String[] args) throws Exception{

//        创建这个是为了拼接字符串
        StringBuilder s = new StringBuilder();

        Class stud = Class.forName("java.lang.String");

        s.append(Modifier.toString(stud.getModifiers()) +"class "+stud.getSimpleName()+"{\n");

        Field[] fields = stud.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append("\n");

        }

        s.append("}");

        System.out.println(s);

    }
}
