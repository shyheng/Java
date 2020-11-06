public class array {
//    数组
    /*数组属于应用数据类型
    数组的父类是object
    1数组是一个容器，可以容纳多个元素
    数组是一个数据的集合
    一组数据
    2，数组可以存储基本数据类型，也可以存储引用数据类型
    3数组是引用数据类型，所以存储在堆内存中
    4对于数组存储的是java对象，是存储对象的引用
    5数组一旦创建，长度不可变
    6数组分为一维数组，二维数组，三维数组等等（常用一维，算法用二维 ）
    7所有的数组对象都有length属性（java自带）用来获取数组中的元素
    8java中数组要求数组中的元素类型统一，int类，引用类
    9数组在内存地址的时候，数组中的元素内存地址（存储的每个元素都是有规则的排列）是连续的
   10 所有的数组都是拿第一个小方块的内存地址作为数组对象的内存地址
   11数组有下标0开始最后一个元素的下标是：length-1
   12我们对元素进行存取的时候都需要通过下标来进行
   数组对数据结构
   1每一个元素的内存地址在看见存储是连续的
   2每个元素类型相同
   3知道一个元素内存地址就知道每个元素的大小
   查找/检索某个下标的元素时效极高，查询效率最高的一个数据结构

  数组中存储100个元素和100万个元素，查找，中效率相同
  运用数学表达式计算出，定位的
缺点
1为了保证数组中每个元素的内存地址，所以在数组随机删除或者增加元素的时候
因为会涉及到统一位移的
2数组不能存储大数据量
很难在内存空间找到
注意，对于最后一个元素的增删，无任何效率影响

14，数组的格式
int []array;
Object[]array;
15,初始化一维数组
包括两种，静态初始化和动态初始化
静态
int [] array = {100,23,5,55}
动态
int []array = new int[5]//这里的5表示数组元素个数
初始一个长度5的int类型，母个数组默认值是0
String[] names = new String[6]//初始一个长度6的Sting类型，默认值null


    *
    *
    * */

    public static void main(String[] args) {
//  声明一个int类型的数组，静太
        int[] a1 = {1,10,100,20,553};
//c++
        //        int a[] = {1,10,100,20,553}

        System.out.println("数组中元素个数"+ a1.length);
//        取
        System.out.println("第一个元素"+a1[0]);
        System.out.println("最后一个"+a1[a1.length-1]);
//        改
        a1[0]= 11;
//        改最后
        a1[a1.length-1]=0;
        System.out.println("第一个元素"+a1[0]);
        System.out.println("最后一个"+a1[a1.length-1]);

//        一维数组遍历
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);//i是从0到5，
        }
//        System.out.println(a1[6]);越界异常
//        从最后到第一个
        for (int i= a1.length-1; i>0; i--){
            System.out.println(a1[i]);//颠倒顺序输出
        }

//        动态
        int[] a= new int[4];
        for (int i = 0; i<a.length; i++){
            System.out.println("下标为"+i+"的元素是"+a[i]);
        }

//        初始一个object类型的数组，动态
        Object[] obj = new Object[5];
        for (int i = 0; i<obj.length;i++){
            System.out.println(obj[i]);
        }

//        String类型
        String[] s = new String[7];
        for (int i = 0; i< s.length;i++){
            System.out.println(s[i]);
        }

//        静态
        String[] ss = {"aba", "asd","ss"};
        for (int i= 0;i<ss.length; i++){
            System.out.println(ss[i]);
        }

//    object的类型，静态
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1,o2,o3};
        for (int i = 0; i< objects.length; i++){
            System.out.println(objects[i]);
        }
    }
}
/*
当你创建数组，确定数组中存取的元素时，用静态方式

当你创建数组，不确定将来数组存储的，采用动态初始化，预分配空间
预存空间
* */