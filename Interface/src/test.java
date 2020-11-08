public class test {
    public static void main(String[] args) {
//        创建厨师对象 中餐 直接更改厨师
//        caidan c1 = new AmericCooker();
          caidan c1 = new ChinaCooker();
//        创建顾客对象

        Customer a = new Customer(c1);
//        顾客点菜
        a.order();
    }
}
