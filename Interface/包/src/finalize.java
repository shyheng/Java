/*
源代码
protected void finalize() throws Throwable { }

垃圾回收器
垃圾销毁时机
如果要销毁就写到finalize()中

finalize()只需要重写

*/
public class finalize {
    public static void main(String[] args) {
//创建对象
        person s = new person();
        s = null;
    }
}
//项目中
class person{
//    重写finalize()方法
//    类回收的时候，垃圾回收器负责调用p.finalize()
protected void finalize() throws Throwable {
    System.out.println("即将回收");
}
}




