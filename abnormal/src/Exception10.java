/*
finally的面试题
* */
public class Exception10 {
    public static void main(String[] args) {
       int r = m();
        System.out.println(r);//100
    }


    /*
    * java语法规则（一些规则不能破坏）
    * java中有一条这样的规则
    * 方法体中的代码必须遵守自上而下顺序依次逐行执行（亘古不变的语法）
    *
    * 还有一条
    * return方法一旦执行，整个方法必须结束
    * */
    public static int m(){
        int i = 100;
        try {
//            这行代码出现在int i = 100；的下面，所以最终结果必须返回100
//            return语句还必须最后包正最后执行，一旦执行，整个方法结束
//            这个return一定是最后执行
            return i;
        }finally {
            i++;
        }

    }
}
