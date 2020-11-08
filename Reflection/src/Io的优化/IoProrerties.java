package Io的优化;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoProrerties {
    public static void main(String[] args) throws Exception{
//        获取一个文件的绝对路径
//        出现乱码
/*        String pash = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.Properties").getPath();
        FileReader reader = new FileReader(pash);*/

//直接与流的形式返回，流的简写
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo.Properties");

        Properties por = new Properties();
        por.load(reader);
        reader.close();
//        通过key获取value
        String className = por.getProperty("className");
        System.out.println(className);

    }
}
