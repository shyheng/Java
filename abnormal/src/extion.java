/*
* 以下程序发生了不正常的情况，叫异常
* java提供了完善的语言，提供异常机制，
* 共参考
* 可以改进
*
* 以下程序执行出现
* Exception in thread "main" java.lang.ArithmeticException: / by zero
	at extion.main(extion.java:12)
	* 异常信息，这个信息是jvm打印的
	*
* */
public class extion {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //实际上jvm在执行到此处的时候，会new对象ArithmeticException: / by zero
//并且jvm将new的异常对象输出，打印输入到控制台
        int c = a / b;
        System.out.println(c);
    }
}
