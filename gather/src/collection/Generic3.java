package collection;
/*
* 自定义泛型
*
* java源代码中经常出现的
* <E>和<T>
* E是Element首字母
* T是Type首字母
* */
public class Generic3 <flwjeijwoi>{
    public void dos(flwjeijwoi o){
        System.out.println(o);
    }

    public static void main(String[] args) {
//        new对象的时候指定了泛型是String类型
        Generic3<String> gt = new Generic3<>();

//        类型不匹配
//        gt.dos(100);

        gt.dos("abc");


        Generic3<Integer> a = new Generic3<>();
        a.dos(100);


        myII<String> m = new myII<>();
        String s1 = m.get();

        myII<Animal> a1 = new myII<>();
        Animal j = a1.get();

//        不用泛型就是Object


    }
}

class myII<T>{
    public T get(){
        return null;
    }
}