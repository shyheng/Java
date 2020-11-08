package Constructor类;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Constructor构造方法
 *   反编译 构造方法
 */
public class Reflect11 {
    public static void main(String[] args)throws Exception {
        StringBuilder s = new  StringBuilder();
        Class vip = Class.forName("Constructor类.Vip");
        s.append(Modifier.toString(vip.getModifiers()));
        s.append(" class");
        s.append(vip.getSimpleName());
        s.append("{\n");

//       拼接构造方法
        Constructor[] constructors = vip.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vip.getSimpleName());
            s.append("(");
//            拼接参数
            Class[] ps = constructor.getParameterTypes();
            for (Class pss :ps){
                s.append(pss.getSimpleName());
                s.append(",");
            }
//            删除下标最后的字符
            if (ps.length>0){
                s.deleteCharAt(s.length()-1);
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
