package Map.TreeMap;

import java.util.TreeSet;

/*
* 先按照年龄升序，如果年龄一样在 按照姓名排序
* */
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Vip> vip = new TreeSet<>();
        vip.add(new Vip("zhas",12));
        vip.add(new Vip("ws",32));
        vip.add(new Vip("asf",12));
        vip.add(new Vip("ggr",17));
        for (Vip vip1:vip){
            System.out.println(vip1);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     *
     * @param o
     * @return
     *
     * compareTo方法的返回值很重要
     * 返回0表示相同，value会覆盖
     * 返回值>0，会继续在右子树上找。【10-9 = 1,1>0的说明左边这个数字比较大，所以在右子树上】
     * <0， 会在左子树上找。【9-10 = -1，-1<0的说明左边这个，所以在左子树上找】
     */
    @Override
    public int compareTo(Vip o) {
//        写排序规则，按照什么进行比较
        if (this.age == o.age){
//            年龄相同时，按照名字排
//            姓名是String类型，可以直接比，调用compareTo方法
            return this.name.compareTo(o.name);
        }else{
            return this.age - o.age;
        }

    }
}
