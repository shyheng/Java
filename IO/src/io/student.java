package io;

import java.io.Serializable;

//java虚拟机看到Serializable接口后，会自动生成一个序列化版本号
//没有手动写，java虚拟机自动
public class student implements Serializable {
    private static final long serialVersionUID = 1168440298410809506L;//一般不会重复，全球唯一性

//    建议序列化版本号手动写出来，不建议自动生成
//    private static final long serialVersionUID = 1L;//java虚拟机识别一个类的，先通过类名，再通过序列化

    private int no;
    private String name;

//    过了很久，这个类，源代码改动,生成了全新的的字节码文件
//    文件再次运行,java虚拟机生成序列化版本号,也会改变
    private int shy;



    public student() {
    }

    public student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
