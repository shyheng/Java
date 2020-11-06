public class xuanze {
    /*选择排序
    * 每一次从这堆参与的数据中找出最小值
    * 拿着这个最小值和最前面的元素交换位置
    * 选择排序比冒泡排序好在：每一次的交换文件都是有意义的
    * 遍历元素找到一个最小（或最大）的元素，把它放在第一个位置，
    * 然后再在剩余元素中找到最小（或最大）的元素，把它放在第二个位置，依次下去，完成排序。
    * */
    public static void main(String[] args) {
        int[] a = {1,32,34,55,533,25,1};

//        选择排序关键怎么找最小的
int shy = 0;//比较次数
        int shy1 = 0;

        for (int i = 0; i < a.length-1; i++) {
//            System.out.println(i);//i是参加最左边的元素下标
//            假设下标i的是最小的数

            int min = i;
            for (int j = i+1; j < a.length; j++) {
//                System.out.println(j);//排序
                shy++;
                if (a[j] < a[min]) {
                    min = j;
                }
            }
//            当i等于min是，表示猜测是对的
//            当i不等于min时，猜测错误，有比更小的数
//            需要交换
            if (min != i){
                int temp;//盒子
                temp= a[min];
                a[min] = a[i];
                a[i]= temp;
                shy1++;
            }
        }
        System.out.println("比较次数"+shy);//于冒泡一样
        System.out.println("交换次数"+shy1);//比冒泡的少5次，效率高
        //        排序之后，得输出
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
/*
* 冒泡排序的核心
*
* */