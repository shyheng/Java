import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 深入try。。catch
*
* 1catch后面的的小括号中的类型可以是具体异常类型，也可以是异常类的父类型
* 2catch可以写多个，建议写catch的时候，精确的一个一个错了。有利于程序的调试
* 3catch写多个的时候，从上到下，必须遵循从小到大
*
* */
public class Exception4 {
    public static void main(String[] args) {
//        编译报错
/*     try {
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");

        }catch (NullPointerException e) {

        }*/

 /*try {
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");
            System.out.println("以上出现异常无法执行");
        }catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }

        System.out.println("hello world");*/

 /*try {
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");
            System.out.println("以上出现异常无法执行");
        }catch (IOException e) {//多态:IOException e = new FileInputStream();
//            Exception e = new FileInputStream();
            System.out.println("文件不存在");
        }

        System.out.println("hello world");*/

/*
        try {
//            创建输入流
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");
//           读文件
            fls.read();
        }catch ( FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (Exception e){//所有的异常都走这个分支
            System.out.println("文件不存在");
        }
*/

 /*       try {
//            创建输入流
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");
//           读文件
            fls.read();
        }catch ( FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件读错了");
        }
*/

/*
// 编译报错
        try {
//            创建输入流
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");
//           读文件
            fls.read();
        }catch (Exception e){//所有的异常都走这个分支
            System.out.println("文件不存在");
        }catch ( FileNotFoundException e) {
            System.out.println("文件不存在");
        }

*/

        try {
//            创建输入流
            FileInputStream fls =  new FileInputStream("F:\\自动办公软件\\wyr.txt");

//            进行数学运算
            System.out.println(100/ 0);//这个异常是运行时异常，编写程序是可处理，也不处理

//            | 在catch是or的意思
        }catch (FileNotFoundException  | ArithmeticException |NullPointerException e){
            System.out.println("文件不存在？数学异常？空指针异常");

        }

    }
}



/*在以后的开发中用哪个方法
如果希望调用者来处理，选择throws
*   其他情况使用捕捉
* */