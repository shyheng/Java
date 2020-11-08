package Map.HashMap;

import java.util.Properties;

/**
 * 目前只需要掌握Properties属性类对象的相关方法即可
 * Properties是一个Map集合，继承Properties，Properties的key和value都是String类型
 * Properties被称为属性类对象
 * Properties是线程安全的
 */

public class Properties1 {
    public static void main(String[] args) {
//创建一个Properties对象
        Properties pro = new Properties();

//        需要掌握Properties的两个方法，一个存，一个取
        pro.setProperty("ur1","jdbc:mysql://localhost:3306/bjpowernde");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("user","root");
        pro.setProperty("pass","123");

//        通过key获取value
        String ur1 = pro.getProperty("ur1");
        String driver = pro.getProperty("driver");
        String use = pro.getProperty("use");
        String pass = pro.getProperty("pass");

        System.out.println(ur1);
        System.out.println(driver);
        System.out.println(use);
        System.out.println(pass);



    }
}
