package 常用类.基本数据类型包装类;
/*
* 关于Integer类的构造方法
* Integer（int）
* Integer(String)
*
* */
public class Intget {
    public static void main(String[] args) {
//        将数字类型装换为Intger包装类型(int-->Integer)
        Integer x = new Integer(100);//装箱，已经过时
        System.out.println(x);

//        将String类型的数字，换为Intger包装类型(String -->Integer)
        Integer y = new Integer("123");
        System.out.println(y);

        Double d = new Double(1.2);
        Double w = new Double("1.2");
        System.out.println(d);
        System.out.println(w);
    }
}
