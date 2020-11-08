package Method类;

/**
 * 用户业务类
 */
public class user {
    /**
     * 登录方法
     * @param name 用户名
     * @param password 密码
     * @return true表示成功，false表示失败
     */
    public boolean login(String name,String password){
        if ("admin".equals(name)&&"123".equals(password)){
            return true;
        }
        return false;
    }

    public void login(int a){}
    /**
     * 退出方法
     */
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
