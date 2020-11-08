/**
 * 关于线程的sleep方法
 * static void sleep(long millis)
 *    1 静态方法
 *    2 参数是毫秒
 *    3 作用：让当前线程进入休眠，进入，阻塞状态，放弃占有的CPU时间片，让给其他线程用
 *        这行代码出现在哪个线程，让哪个线程进入休眠
 *    4 Thread.sleep()方法，可以用来
 *       间隔待定时间，去执行一段特定的代码，每隔多久执行一次。
 */
public class Thread5 {
    public static void main(String[] args) {
//        让当前线程进入休眠，停止5秒
//        当前线程进入主线程
/*        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello woeld");*/

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"hhh"+i);
//            睡眠1秒，每循环一次，睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
