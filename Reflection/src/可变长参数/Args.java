package 可变长参数;

/**
 * 可变长参数  掌握
 *   int...args 这就是可变长cs
 *     语法：类型...(注意一定是三个点)
 *
 *  1 可变长参数要求参数是0到N个
 *  2 可变长参数在列表参数中必须在最后一个位置上，而且可变长参数只能有1个
 *  3 可变长参数可以看做数组
 */
public class Args {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
//        m("abc");
        m2(100);
        m2(100,"ABC");
        m2(100,"ABC","zhng","sss");

        m3("ss","ABC","zhng","sss");

        String[] st = {"ss","ABC","zhng","sss"};
        m3(st);

        m3(new String[]{"ss","ABC","zhng","sss"});

        m3("ss","ABC","zhng","sss");
    }
    public static void m(int... args){
        System.out.println("m方法执行");
    }

//    public static void m2(int...a,String...a1){}

//只能有一个，而且必须在最后
    public static void m2(int a,String...a1){}

    public static void m3(String...a){
//        args有数组，可以说明，args是一个数组
//        可以将可变长参数当做数组
//        也可以传一个数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
