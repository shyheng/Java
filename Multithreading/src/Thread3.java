/**
 * 使用匿名内部类
 */
public class Thread3 {
    public static void main(String[] args) {
//       创建线程对象，创建匿名内部类
//        没有名字的类，new出来对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程"+i);
                }
            }
        });

//        启动线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程"+i);
        }
    }
}
