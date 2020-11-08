/*
*异常对象有两个非常重要的方法
* 获取异常简单的描述信息
* String msg = exception.getMessage();
*
* 打印异常追踪的栈信息
* exception.printStackTrace();
*
* */
public class Exception5 {
    public static void main(String[] args) {
//        这里只是new了异常对象，但是没有抛出，jvm只会认为是普通对象
        NullPointerException e = new NullPointerException("空指针异常");
//        获取异常简单信息描述，这个信息实际上就是构造方法上的String参数
        String msg = e.getMessage();
        System.out.println(msg);

//        打印异常栈信息
//        java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印
        e.printStackTrace();

        for (int i = 0; i < 100; i++) {
            System.out.println("i"+i);
        }
        
        System.out.println("hle");
    }
}
