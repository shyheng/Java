/*
模拟一个系统，假设这个系统，必须输入用户名和密码
*/
public class at3 {
//    用户名和密码输入到String[] args数组中
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("错误 输入账户和密码");
            return;
        }
//        过了用户名和密码规格正确
//       判断用户名和密码是否正确
//        去出用户名
        String user = args[0];
//        去出密码
        String pass = args[1];
//        假设用户名是admin，密码是123的时候表示登录成功，其他错误
//        判断两个字符串相等
//        if (user.equals("admin") && pass.equals("123"))
//        有bug，容易出现空指针异常,null会出现，什么也不写
        if ("admin".equals(user)&&"123".equals(pass))
        {
            System.out.println("登录成功"+user+"欢迎光临");
        }
        else {
            System.out.println("密码错误，用户名不存在");
        }
    }
}
