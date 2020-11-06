

public class util {
    /*
    * 数组工具类，自己写的，不是sun的
    * 关于二分法(折半查找)
    * 排序好后，二分之一，中间数比较，取左右，再比，在取
    *
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,4,56,76,78,100,200,523};

//        找出200所在的下标
//        调方法
        int index = binarySearch1(arr,200);
        System.out.println(index == -1 ? "这个元素不存在":"该元素为"+index);
    }

    private static int binarySearch1(int[] arr, int dest) {
//        开始下标
        int begin = 0;
//        结束下标
        int end = arr.length-1;
        while (begin <= end) {
//        中间元素
            int mid = (begin + end) / 2;


            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
//            目标在中间的右边
//            开始元素下标需要发生变化（开始 元素重新赋值）
                begin = mid + 1;//一直曾
            } else {
//            arr[mid] > dest
//            目标元素在中间的左边
//            结束元素的元素发生变化
                end = mid - 1;//一直减
            }
        }
        return -1;
    }


}
