/**
 * 怎么合理的终止线程的执行。这种方式很常用
 */

public class Thread9 {
    public static void main(String[] args) {
        my5 m = new my5();
        Thread t = new Thread(m);
        t.setName("zph");
        t.start();

//        模拟5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        终止线程
//        你想要什么时候终止t的执行，那么你吧标记修改为false，就结束了。
        m.run = false;

    }
}


class my5 implements Runnable{
boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"shy"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
//                return就结束了，结束之前还有要保存在这个可以保存


//                终止当前线程
                return;

            }

        }
    }
}