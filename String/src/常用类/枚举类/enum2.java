package 常用类.枚举类;
//采用枚举的方法
/*
* 总结
*
* 枚举是一个引用数据类型
* 枚举的语法
* enum 枚举类型名{
* 枚举值1，枚举值2
* }
*
* 结果只有两种情况，建议使用布尔类型
* 结果超过两种，用枚举
* eg 颜色，四季，星期，可以使用枚举类型
* */

public class enum2 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();

        result r = dai(10,2);
        System.out.println(r == result.SUCCESS ? "成功":"失败");


        long b = System.currentTimeMillis();
        System.out.println("用时"+(b-a));

    }

    /*
* 计算两个int类型数组的商
* result.SUCCESS表示成功
* result.FAIL表示失败
* */
    public static result dai(int a, int b){
        try {
            int c = a / b;
            return result.SUCCESS;
        }catch (Exception e){
            return result.FAIL;
        }
    }
}

//枚举：一枚一枚可以列举出来的，才建议使用
//    枚举编译之后也是生成class
//枚举也是一种引用类型
//枚举中的每一个值可以看做是常量
enum result{
//   SUCCESS 是枚举中result类型的一个值
//    FAIL 也一个值
//    枚举中的每一个值，可以看做是常量
    SUCCESS,FAIL
}
