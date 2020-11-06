
import java.util.Arrays;

public class gongju {
    public static void main(String[] args) {

        int[] arr = {11,23,43,3};
        //        工具类大部分是静态
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
