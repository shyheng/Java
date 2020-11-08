package Map.HashMap;

import java.util.Objects;

public class Student {


    private String name;
//构造方法
    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    equals
//如果学生名字一样返回true，表示同一个学生
   /* @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Student)) return false;
        if (this == o) return true;
        Student s = (Student)o;
        return this.name.equals(s.name);
    }
    //    hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
