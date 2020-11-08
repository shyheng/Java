/**
 * 强行终止一个线程的执行
 *    t.stop();//已过时（不建议使用）
 *    直接杀死，线程没有保存数据将会丢失，不建议使用
 */
public class Thread8 {
    public static void main(String[] args) {
        Thread t = new Thread(new my4());
        t.setName("zph");
        t.start();

//        模拟5秒睡眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        5秒之后强行终止t线程，5秒结束所以
//        t.stop();//已过时（不建议使用）


    }
}


class my4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"shy"+i);
            try {
                Thread.sleep(1000*1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}