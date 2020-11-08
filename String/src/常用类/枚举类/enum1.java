package 常用类.枚举类;

public class enum1 {
    public static void main(String[] args) {
        long kaishi = System.currentTimeMillis();

//        System.out.println(10/0);//异常java.lang.ArithmeticException: / by zero
        boolean shy = dai(10,2);
        System.out.println(shy ? "计算成功":"计算失败");//1

        boolean shy1 = dai(10,0);
        System.out.println(shy1? "计算成功":"计算失败");//0


        long jieshu = System.currentTimeMillis();
        System.out.println("用时"+(jieshu-kaishi));
    }
/*
* 以下程序，计算两个int 类型的商
*
* 返回1表示成功，返回0表示失败
* */

/*    public static int dai(int a, int b){
       try {
           int c = a / b;
//           程序执行到此处表示以上代码没有异常，成功
           return 1;
       } catch (Exception e){
//           程序执行到此处，说明出现异常
//           表示执行失败
           return 0;
       }
    }*/
//这个方法返回一个int不恰当，最好使用布尔类型，可以表示不同的状态

//写错了，但是，编译器不知道
    public static boolean dai(int a, int b){
    try {
        int c = a / b;
//           程序执行到此处表示以上代码没有异常，成功
        return true;
    } catch (Exception e){
//           程序执行到此处，说明出现异常
//           表示执行失败
        return false;
    }
}
/*
* 上面两个方法，要不写错，要不太局限
* 多种情况布尔就没用了
* */
}
