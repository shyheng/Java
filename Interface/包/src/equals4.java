import java.util.Objects;
//string类和基本数据类型
//总结
public class equals4 {
    public static void main(String[] args) {
        student s1 = new student(12, "ss");
        student s2 = new student(12, "ss");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
class student {
    int no;
    String school;

    //构造方法
    public student() {
    }

    public student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    //    重写toString方法
    public String toString() {
        return "学号" + no + "所在学校" + school;
    }
//重写equals
//    需求，当一个学生学号相同，学校相同 ，表示同一个学生
//一个模板，到处使用
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof student)) return false;
        if (this == obj) return true;
        student s = (student)obj;
        return this.no == s.no && this.school.equals(s.school);


    }

}

