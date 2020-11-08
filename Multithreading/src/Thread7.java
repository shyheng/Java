/**
 * sleep睡眠太久，希望半道叫醒。   如何叫醒一个正在睡眠的线程？
 *
 *   注意  不是中断线程的执行，是中断线程的睡眠
 */
public class Thread7 {
    public static void main(String[] args) {
        Thread t = new Thread(new my3());
        t.setName("t");
        t.start();

//        希望5之后，t线程醒（5秒之后主线程完成）
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        中断t线程的睡眠（这个interrupt依靠java异常处理机制）
        t.interrupt();//干扰，try结束，一盆冷水泼过去，在哪写都一样
    }
}


class my3 implements Runnable{
    @Override
//    重点 run方法当中的异常不能throws ，只能try
//    因为run方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常
    public void run() {
        System.out.println(Thread.currentThread().getName()+"睡觉");
//        睡眠一年
//        子类重写不能抛出更多的异常，所以在子类中只能try
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
//            打印异常信息，注释去红字
//            e.printStackTrace();
        }
//        一年之后才运行
        System.out.println(Thread.currentThread().getName()+"起来");
    }
}