package 生产者和消费者;

import java.util.ArrayList;
import java.util.List;

/**
 * 1 使用wait方法和notify方法实现“生产者和消费者模式”
 * 2  生产线程负责生产，消费线程负责消费
 *   生产线程和消费线程要达到均衡
 *   这是一种特殊的业务需求，在这种特殊的情况下小雨是用wait方法和notify方法
 * 3  wait方法和notify方法不是线程对象的方法，是普通java对象都有的方法
 * 4  wait方法和notify方法建立在线程同步的基础之上，因为多线程同时操作一个仓库。有线程安全问题
 *
 *  5 wait方法作用，o.wait让正在o对象上活动的线程t进入到等待状态，并且释放t线程之前占有的o对象的锁
 *
 *  6 notify方法 o.notify让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上占有的锁
 *
 *  7 模拟一个需求
 *     仓库采用list集合
 *     List集合中假设只能储存一个元素
 *     1个元素不是仓库满了
 *     如果list集合中元素是0表示仓库空了
 *
 *     包正list集合永远都是储存1个元素
 *
 *     必须做到生产一个消费一个
 *
 */
public class Thread16 {
    public static void main(String[] args) {
//        创建一个仓库对象
        List list = new ArrayList();
//        创建两个线程对象
//        生产线程
        Thread t1 =new Thread(new sheng(list));
//        消费线程
        Thread t2 = new Thread(new xiao(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();

    }
}


//生产线程
class sheng implements Runnable{
private List list;
public sheng(List list){
    this.list = list;
}
    @Override
    public void run() {
//    一直生产,使用死循环，模拟生产
        while (true){
//           给仓库对象list加锁
            synchronized (list){
               if (list.size()>10){
//                等着，满了,并且释放list锁
                   try {
                       list.wait();//释放锁，让消费者进入
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
//               程序到这说明
//                仓库空的，消费者的wait()
                Object obj = new Object();
               list.add(obj);
                System.out.println(Thread.currentThread().getName()+">"+obj);

//                装库了 ，唤醒消费者
                list.notify();
           }

        }
    }
}


//消费线程
class xiao implements Runnable{
    private List list;
    public xiao(List list){
        this.list = list;
    }
    @Override
    public void run() {
//一直消费
        while (true){
            synchronized (list){
                if (list.size()==0){
                    //仓库以及空，还消费个毛，
                    try {
                        list.wait();//调用生产者，进行等待，释放离开
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                程序到这，说明仓库有数据，可以消费，生产者的wait()
                Object o =  list.remove(0);
                System.out.println(Thread.currentThread().getName()+">"+o);
//                唤醒生产者生产
                list.notifyAll();
                //可以唤醒所有
//                因为不会释放锁
            }
        }
    }
}