/*
* final finally finalize
*
* final 关键字
* 无法继承
* 无法覆盖
* 不能从新赋值
*
* finally 关键字
* 和try一起联合使用
* finally一定执行
*
* finalist 标识符
* 是一个Object类中的方法
* 这个方法是由垃圾回收器GC负责调用
* 立遗嘱方法
* */
public class Exception11 {
    public static void main(String[] args) {
//        final是一个关键字表示最终的，不变
        final int i = 100;
//        i = 200;

//        finally也是一个关键字，和try联合使用，使用在异常处理机制中
//        在finally语句中的代码块是一定会执行
        try {

        }finally {
            System.out.println("s");
        }

//        finalize()是Object类中的一个方法，作为方法名出现
//        所以finally是标识符

    }
}
