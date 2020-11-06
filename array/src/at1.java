public class at1 {
//    当一个方法的参数是一个数组的时候我们可以采用

    public static void main(String[] args) {
//静态初始化一维数组
        int[] a = {1,2,3};
        print(a);
//        动态初始化
        int[] a2 = new int[4];
        print(a2);
        print(new int[2]);
//        静态语法
        print(new int[]{1,2,3});
    }

    public static void print(int[] array){
        for (int i = 0; i<array.length;i++){
            System.out.println();
        }
    }
}
