import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

/*
* 处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出
* 谁抛抛给谁，抛给调用者
* */
public class Exception3 {

//   一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给jvm。jvm只有终止
//    异常处理机制的作用就是增强程序的健壮性，所以，一般main方法中的异常使用try...catch进行捕捉，，main就不要上抛了

   /* public static void main(String[] args) throws Exception {
        System.out.println("main be");
        m1();
        System.out.println("main ov");
    }*/
   public static void main(String[] args){
long a = System.currentTimeMillis();

       //       属于算数异常，可以管也可以不管，运行时异常
       try {
           System.out.println(100/0);
       }catch (ArithmeticException e) {
           System.out.println("瞎搞");
       }

/*
* 注意：只要异常没有捕捉，采用上报，此后的方法不再执行
*另外需要注意，try语句块中的某一行出现异常，该行后面代码不会执行
*
* try
* */

       System.out.println("main be");
       try {
//           try是尝试
           m1();
       } catch (FileNotFoundException e) {//e就是引用，e引用就是保存的内存地址是哪个new出来的异常对象
//           catch是捕捉异常之后的分支
//           在catch分支中处理异常，处理下面代码，不处理try中
           System.out.println("文件找不到");
       }
       System.out.println("main ov");

       long b = System.currentTimeMillis();
       System.out.println("用时"+(b-a));
   }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 be");
        m2();
        System.out.println("m1 ov");
    }
//抛别的不行啊  报错
    //    private static void m2() throws ClassNotFoundException{

    //抛FileNotFoundException的父类对象IOException，这样是可以的，因为IOException包括FileNotFoundException
//    private static void m2() throws IOException {

//  这样也可以，因为Exception包括所有的异常。
//    private static void m2() throws Exception {

//   也可以写多个异常,可以使用逗号隔开
//    private static void m2() throws ClassNotFoundException,FileNotFoundException {

    private static void m2() throws FileNotFoundException {
        System.out.println("m2 be");
//        报错原因，m3（）方法有throws FileNotFoundException
//        这没对m3进行异常处理,所以编译报错


        m3();
        System.out.println("m2 ov");
    }
    private static void m3() throws FileNotFoundException {
//        调用sun中 jdk中某个类的构造方法
//        io流的构造方法，借助学习异常机制
//       创建一个输入流对象，该流指向文件路径

//        报错原因，
        /*
        第一；这里调用了一个构造方法：FileInputStream(String name)
        第二：这个构造方法上的声明上有throws FileNotFoundException
        第三：通过这个类继承结构看到 FileNotFoundException 父类是IOException
        IOException的父类是Exception
        最终得知FileNotFoundException是编译时异常编写程序阶段必须对他进行处理，不然报错


        编译时异常要求程序员
        * */
//        new FileInputStream("F:\\自动办公软件\\wyr.txt");

//        我们采用第一种方式：在方法声明的位置上使用throws继续上抛
        new FileInputStream("F:\\自动办公软件\\wyrtxt");
    }
}
