public class Exception2 {
/*
//    第一种处理方式：在方法声明的位置上使用：throws，来完成异常的继续上抛。抛给调用着
//上抛类似于推卸责任。（继续把异常传递给调用者）
    public static void main(String[] args) throws ClassNotFoundException{
        dos();
    }
*/

//第二种方法：try...catch进行捕捉
//    捕捉等于把异常拦下，异常真正的解决了（调用者是不知道）
    public static void main(String[] args) {
        try {
            dos();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void dos() throws ClassNotFoundException{
        System.out.println("娃还在");
    }
}
