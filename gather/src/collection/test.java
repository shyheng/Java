package collection;

class c1 {

    public c1(){
        System.out.println("c1");
    }

}
class c2 extends c1{
    public c2(){
        System.out.println("c2");
    }
}
class c3 extends c2{
    public c3(){
        System.out.println("c3");
    }
}
public class test{

    public static void main(String[] args) {
        Object c3 = new  c3();
    }
}

