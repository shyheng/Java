package 验证反射机制的灵活性;

import java.io.FileReader;
import java.util.Properties;

/**
 * 验证反射机制的灵活性
 *    java代码写一遍，不在改变java源代码的基础之上，可以做到不同对象的实例化。
 *    非常灵活（符合OCP开闭原则，对扩展开放，对修改关闭）
 *
 *    后期要学习框架，而工作中也用框架
 *    包括 ssh ssm
 *    Spring SpringMVC MyBatis
 *    Spring Struts Hibernate
 *
 *    这些高级框架底层原理，都采用了反射机制，
 *    学会反射机制有利于剖析框架底层的源代码
 */
public class Reflect3 {
    public static void main(String[] args) throws Exception{

//        这个方式写死了，只能创建一个类型对象
//        user u = new user();

//        以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改后可以创建出不同的实例对象

//        通过Io流读取classinfo.properties文件

        FileReader read = new FileReader("src/classinfo.Properties");
//        创建属性类对象Map
        Properties pro = new Properties();
//        加载
        pro.load(read);
//        关闭
        read.close();

//        通过key获取value
        String className = pro.getProperty("className");
//        System.out.println(className);

//        通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}
