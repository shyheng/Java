public class ExceptionTrst {
    public static void main(String[] args) {
//       创建异常对象（只new了异常对象，并没有手动抛出）
        myException e = new myException("用户名不能为空");
        //打印异常堆栈信息
        e.printStackTrace();
//        获取异常简单描述
        String ms = e.getMessage();
        System.out.println(ms);
    }
}
