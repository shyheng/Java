//如果是引用类型怎么判断
//tostring 和equals都要重写
//但是字符串不需要重写
//比较两个字符串用equals

public class equals2 {
    public static void main(String[] args) {

        String s1 = new String("shy");
        String s2 = new String("shy");
//        System.out.println(s1 == s2);//判断地址false
        System.out.println(s1.equals(s2));//true

        String s3 = new String("wang");
        System.out.println(s3.toString());//wang
        System.out.println(s3);//可以简写
    }

}
/*大结论
java中基本数据类型比较是否相等，使用==

java中所有引用数据类型统一使用equals方法判断是否相等
 */