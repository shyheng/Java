package io.对象的序列化和反序列化1和1;

import io.student;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

/**
 * 文件的序列化和反序列化
 * 1 异常 java.io.NotSerializableException,不支持序列化
 *
 * 2 参与序列化和反序列化，必须实现Serializable接口
 *
 * 3 注意 通过源代码发现，Serializable接口只是一个标志接口
 *    这个接口代码什么都没有
 *     起到了标识的作用，java虚拟机参考的，进行类的特殊化
 *
 *     反编译
 *  4 序列化版本号有什么用
 *   java.io.InvalidClassException:
 *   io.student; local class incompatible://序列化版本号不一样异常
 *   stream classdesc serialVersionUID = -7301693545715091660,（之后的）
 *   local class serialVersionUID = -5772468514745561731(之前的)
 *
 *   java语言中采用什么机制来区分类的
 *   第一  首先通过类名进行对比，类名不一样，肯定不是同一个类
 *   第二   如果类名一样，在怎么进行区别？靠序列化版本号进行区分
 *
 *   同一个编写了一个类，但是，这两个类不是同一个类
 *   对于java虚拟机来说，java虚拟机是可以区分的
 *   都有默认序列化版本号，所以区分开了（自动生成版本号）
 *
 *   自动生成序列化版本号的缺点
 *   无法改代码
 *   一改必然会重写编译，此时会生成新的序列化版本号
 *
 *   所以凡是实现Serializable接口，手动固定版本号
 *   模仿ArrayList
 *
 *
 */
public class ObjectOutputStream1 {
    public static void main(String[] args) throws Exception{
//       创建java对象
        student s = new student(11,"张");
//        序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

//        序列化对象
        oos.writeObject(s);

//        刷新
        oos.flush();

//        关闭
        oos.close();
    }
}
