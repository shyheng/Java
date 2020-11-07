package io.对象的序列化和反序列化1和1;

import io.user;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化集合
 *
 * transient关键字
 * user{no=1, name='null'}
 * user{no=2, name='null'}
 * user{no=3, name='null'}
 * 不参与序列化
 */
public class ObjectInputStream2 {
    public static void main(String[] args)throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
//        Object obj = ois.readObject();
//        System.out.println(obj instanceof List);//是否是List集合
        List<user>  list= (List<user>)ois.readObject();
//        遍历。迭代
        for (user u : list){
            System.out.println(u);
        }
        ois.close();

    }
}
