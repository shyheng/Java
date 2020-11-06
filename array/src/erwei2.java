/*
关于二维数组的读和改
第一个数组
a[][]第一个一维数组中第一个元素
*/
public class erwei2 {
    public static void main(String[] args) {
        int[][] e = {
                {100,200,300},
                {10,20,30},
                {0,1,2}};
//        取二位数的第一个一维数组
        int[] a0 = e[0];
        int a = a0[0];
        System.out.println(a);
//合并
        System.out.println(e[0][0]);
        e[0][0] = 11;
        System.out.println(e[0][0]);
        System.out.println(e[5][5]);//越界异常
    }
}
