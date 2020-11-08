package 异常作业.作业;

/*
用户业务类，处理用户相关的业务：eg 登录，注册等功能
*/
/*
用户
usename用户名
Password密码
IegalArgsException当用户名或长度不对，会出现异常
 */
public class UseService {


    public void register (String usename,String Password) throws IegalArgsException {
/*
引用等于null的这个判断最好放在所以条件的最前面
最好这样写
null == usename
*/
        if (null == usename|| usename.length()< 6||usename.length()>14){
            throw new IegalArgsException("用户名不合法");
        }
//程序到这合法
        System.out.println("注册成功"+usename);
    }

}
