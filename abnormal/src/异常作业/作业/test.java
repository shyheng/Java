package 异常作业.作业;

public class test {
    public static void main(String[] args) {
//        创建用户对象
        UseService u = new UseService();
//密码从控制台不出来
        try {
            u.register("assssss","b");
        } catch (IegalArgsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
