
/*测试改良之后的mystack
*
* */
//注意最后这个例子，是异常最重要的案例，必须掌握，自定义异常在实际开发中的作用
public class Exception12 {
    public static void main(String[] args) {
//       创建对象
        mystack s = new mystack();
//        压栈
        try {
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
            s.push(new Object());
        } catch (MyStackOperationException e) {
//            e.printStackTrace();
//            输出异常简单信息
            System.out.println(e.getMessage());
        }
//        弹栈
        try {
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        } catch (MyStackOperationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
