package 第三种实现线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;//juc包的，属于java的并发包，老的jdk没有

/**
 * 这种方式的优点是：可以获取线程的执行结果
 * 缺点 效率低
 */
public class Thread15 {
    public static void main(String[] args) throws Exception{
//        创建一个未来任务类对象
//        参数非常重要，需要个一个Callable接口实现对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call()方法相当于run方法，只不过有返回值
//线程执行一个任务，之后有返回值
//                模拟执行
                System.out.println("call beg");
                Thread.sleep(10000);
                System.out.println("eng");
                int a = 100;
                int b = 200;
                return a+b;//自动装箱（300结果变成Integer）
            }
        });

//        创建线程
        Thread t = new Thread(task);

//        启动线程
        t.start();

//        在主线程中怎么获取t的返回值
//        会不会导致主线程阻塞
//        所以get方法会导致线程阻塞
        Object obj = task.get();

//        主方法这里必须等get方法结束，进入阻塞
        System.out.println("hello");
    }
}
