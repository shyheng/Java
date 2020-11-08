package 资源绑定器;

import java.util.ResourceBundle;

/**
 * java util包提供了一个 资源绑定器，便于获取属性配置文件中的内容
 *   使用这个方式的时候，属性配置文件properties必须放到类路径下
 *
 *   np
 */
public class ResourceBundle1 {
    public static void main(String[] args) {
//        资源绑定器 ，只能绑定properties文件。并且这个文件在类路径下。文件拓展名必须是properties
//        并且写的时候，后面路径不能写
        ResourceBundle bundle = ResourceBundle.getBundle("验证反射机制的灵活性/dd");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
