public class Thread12 {
    public static void main(String[] args) {
        System.out.println("mainbig");

        Thread t = new Thread(new my9());
        t.setName("w");
        t.start();

//        合并线程
        try {
            t.join();//w合并到当前线程中，当前线程受阻，w执行
//            但是栈还是有两个
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("wan");
    }
}


class my9 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"s"+i);
        }
    }
}