package 常用类.日期处理;
/*
* 获取自1970年1月1日00:00:00 000到当前时间的总毫秒数
* 1秒等于1000毫秒
*
* 简单总结下System类的相关属性和方法
* System.out(out是System类是静态变量)
* System.out,println(println()方法不是System类的，是PrintStream类的方法)
* System.gc() 建议启动力矩回收器
* System.currentTimeMillis() 获取自1970年1月1日00:00:00 000到当前时间的总毫秒数
* */
public class Date2 {
    public static void main(String[] args) {
//        自1970年1月1日00:00:00 000到当前时间的总毫秒数
        long now = System.currentTimeMillis();
        System.out.println(now);//1588082018190

//        在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        pe();

//        在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end -begin)+"毫秒");
    }



    //    需要：统计一个方法执行所耗费的时长
public static void pe(){
    for (int i = 0; i < 1000; i++) {
        System.out.println("i"+i);
    }
}
}
