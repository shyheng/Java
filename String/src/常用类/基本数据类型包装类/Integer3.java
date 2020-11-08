package 常用类.基本数据类型包装类;

public class Integer3 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);//false
/*
* java中为了提高效率，将[-128- 127]之间的所有包装对象提前创建好
*放到了一个方法区的“整数型常量池”当中，目的是只要用了这个区间的数据
* 不需要要在new对象。直接从整数型常量池当中取出来
*
* 池，cache 就是缓存机制，提高效率，提前准备好东西，缺点耗费内存
*
* 大型项目的重要优化手段就是cache缓存机制
* */
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);//true
    }
}
