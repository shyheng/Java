package 改进线程安全;

/**
 * 银行账户
 *
 * 使用线程同步机制，解决线程安全
 */
public class Account {
//    账号
    private String actno;
//    余额
    private double balance;

//    对象
    Object o = new Object();//实例变量(Account对象多线程共享的，Account对象中的实例变量obj是共享)

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    取款的方法
    public void withdraw(double money){
//       以下代码必须是线程排队，不能并发
//        一个线程把这里的代码全部执行全部执行结束之后，另一个线程才能进来
        /**
         * 线程同步机制的语法是
         * synchronized (){
         *     //线程同步代码块。
         * }
         * synchronized ()，后面小括号必须是非常关键的
         * 这个数据必须是多线程共享数据。才能达到多线程排队
         *
         * （）中写什么
         *    那要看你要线程同步
         *     假设12345，有5个线程
         *     你只希望123排队，45不用排队，怎么办
         *     你一定要（）中写123共享的对象
         *     而这个对象对于45来说不是共享
         *
         *
         *     这里的共享对象是账户对象
         *     账户对象是共享的，那么this就是账户对象吧
         *
         *     不一定是this，效率低
         *
         *     java对象都有锁
         *
         *     synchronized上厕所锁门，其实这把锁就是标记
         *     100个对象，100把锁
         *
         *     1，假设1和2 线程并发，开始执行以下代码的时候，肯定一个先一个后
         *     2，就是1先执行了，遇到synchronized，这个时候自动找“后面共享对象‘的对象锁之后
         *     并占有这把锁，然后执行同步代码块中的程序，在程序执行中一直都是占有这把锁。直到同步代码块结束
         *
         *     3 假设1已经占有着这把锁，此时2也遇到了synchronized关键字，也会去占有后面共享对象
         *     结果这把锁被1占有，2也只能在同步代码块外面等待1的结束
         *     直到1结束，1会归还这把锁，此时2终于得到这把锁，然后执行
         *
         *     注意  这个共享对象一定要选好，这个共享对象一定是你需要排队
         *     执行的这些想对象所共享的
         *
         *     this必须是t和t1共享的
         *     共享对象很重要
         *     如果不是共享，就是不是同步
         *     synchronized可以理解为进入阻塞状态
         *
         *     拿着一个共享对象就行，找出他们相同的地方
         *
         *     synchronized保护  成员变量，（实例变量，静态变量）
         *     局部变量和常量，不会有线程安全
         */

//        Object obj = new Object();//局部变量,不是共享的，不安全
//        synchronized (this){
//        synchronized (o){//o也能通过
//        synchronized (obj){obj不是共享对象，如果1和2拿了，都需要重新new对象
//        synchronized ("abc"){//"abc"字符串常量池中，共享，而且所有行程同步，this就有区别，如果有其他账号就，得全部等着
  /*      Object b = null;
        synchronized (b){//空指针异常
*/
        double begore = this.getBalance();
        double after = begore-money;

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setBalance(after);

//        }
    }
}
