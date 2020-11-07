package io.IO和Properties集合的联合使用;

import java.io.FileReader;
import java.util.Properties;

/**
 *IO和Properties集合的联合使用
 *   非常好的理念
 *      以后经常改变的数据，可以单独写到文件中，使用程序动态读取
 *      将来只需要修改这个文件的内容，java代码不需要改，不需要重新
 *      编译，服务器也不重启，就可以拿到动态信息
 *
 *
 *  类似于以上机制文件，被称为配置文件
 *  并且当配置文件的中的内容格式是
 *      key1 = value
 *      key2 = value
 *      的时候，我们把这种配置文件叫做属性配置文件
 *
 *  java规范中，要求，属性配置文件建议以.Properties结尾，但是不是必须的
 *  这个以.Properties结尾的文件在java中被称为，属性配置文件
 *  其中Properties是专门存放属性配置文件内容的一个类
 *
 */
public class IoProperties1 {
    public static void main(String[] args) throws Exception{
        /**
         * Properties是一个Map集合，key和value都是String类型
         * 想将userimfo文件中的数据加载到Properties对象当中
         *
         */
//        新建一个输入流
        FileReader reader = new FileReader("src/io/IO和Properties集合的联合使用/userimfo.Properties");

//        新建一个Map集合
        Properties por = new Properties();

//        调用Properties对象的load方法将文件中数据加载到Map集合中
        por.load(reader);//文件中的数据顺着管道加载到Map集合中，其中，等号左边是key，右边是value

//        通过key获取value
        String usename =  por.getProperty("uernme");
        System.out.println(usename);
//        直接改文件。不需要改java
//


        reader.close();
    }
}
