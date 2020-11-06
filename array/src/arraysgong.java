import java.util.Arrays;
/*
* java.util.Arrays方法
*
* */

public class arraysgong {
    public static void main(String[] args) {
        int[] arr = {123,34,4,5,32,53,3};
        Arrays.sort(arr);
//        输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        二分法（排序后二分法）
        int index = Arrays.binarySearch(arr,5);
        System.out.println(index == -1 ?"不存在":"该元素为"+index);
//三目运算
    }
}
