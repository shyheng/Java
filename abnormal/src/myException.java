/*
* sun公司提供的jdk内置的异常肯定是不够用的，在实际的开发
* jdk都没有，和业务挂狗的
* 可以自己定义
*
* 自定义
* 两步
* 第一步：编写一个类继承Exception或者runtimeException
* 第二步：提供两个构造方法，一个无参，一个带有String参数的
* */
public class myException  extends Exception {//编译时异常
    public myException(){

    }

    public myException(String s){
        super(s);
    }
}
    //public class myException  extends RuntimeException{//运行时异常
//}



