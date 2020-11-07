package io.对象的序列化和反序列化1和1;

import io.user;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 反序列化集合
 *  参与序列化的ArrayList集合以及集合中的元素User都需要实现Serializable接口
 *
 *  不使用集合，多个序列化，第二报错
 *
 */
public class ObjectOutputStream2 {
    public static void main(String[] args) throws Exception{
        List<user> userList = new ArrayList<>();
        userList.add(new user(1,"a"));
        userList.add(new user(2,"b"));
        userList.add(new user(3,"c"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        //序列化一个集合，这个集合中放了很多对象
        oos.writeObject(userList);

        oos.flush();
        oos.close();

    }
}
