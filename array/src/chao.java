/*
* 元素查找
* 第一种方式：一个一个挨着找，找到位置
* 第二种方法：二分法（算法），效率高
*
* */
public class chao {
    public static void main(String[] args) {
//第一种
        int[] arr = {4,3,24,2,8};

/*//        需求找出24的下标，如果没有返回-1
//        一个一个挨着找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 24){
                System.out.println("24元素的下标"+i);
                return;
            }
        }
//        程序执行到这里代表没有
        System.out.println("不存在");*/

//封装一个方法
//        传第一个参数是数组，第二个是被查找的元素
//        返回值：查找元素的下标。如果不存在返回-1
        int index = arrseach(arr, 8);
        System.out.println(index == -1 ? "该元素不存在":"该下标为"+index);

    }

    /*
    * arr 被检索的元素
    * ele 被检索的元素
    * 大于等于0的数表示元素的下标，-1不存在
    * 有相同的返回第一个出现的
    * */
    public static int arrseach(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
