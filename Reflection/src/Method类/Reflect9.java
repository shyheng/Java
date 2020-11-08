package Method类;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Method反编译
 *  了解
 *   可以反编译一个类的方法
 */
public class Reflect9 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class usr = Class.forName("Method类.user");
        s.append(Modifier.toString(usr.getModifiers())+" class"+usr.getSimpleName()+" {\n");

        Method[] methods = usr.getDeclaredMethods();
        for (Method method : methods){
//            public boolean login(String name,String password){
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
//           参数列表
            Class[] pae = method.getParameterTypes();
            for (Class p : pae){
                s.append(p.getSimpleName());
                s.append(",");
            }
//            s.substring(0,s.length());
            s.deleteCharAt(s.length()-1);
            s.append("){}\n");

        }

        s.append("}");
        System.out.println(s);
    }
}
