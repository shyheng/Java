/*
二维数组
二维数组是一个特殊的一维数组，特殊在一维实在当中的每一个元素是一个一维数组
三维数组
三维数组是一个特殊二维数组，每个二维数组中每一个元素是一个一维数组
常用一维数组，少用二维数组，几乎不用三维数组

二维数组静态初始化

*/
public class erwei {
    public static void main(String[] args) {
//        一维数组
        int[] a = {100,200,300};
        System.out.println(a.length);
//        二维数组
        int[][] e = {
                {100,200,300},
                {10,20,30},
                {0,1,2}};
        System.out.println(e.length);//3
        System.out.println(e[0].length);//3
    }
}
