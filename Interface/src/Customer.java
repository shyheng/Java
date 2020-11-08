//顾客

//顾客手里有菜单
//has a 都以属性的形式存在 接口，我中有你  is a我是你继承
/*
//自己类
my has a py不是my is a py
class my{

py f;你没有朋友null

//通过构造方法得到朋友
public my(py f){
  this.f = f
}
public static void main (String [] args){



 //    创建朋友对象
py f = new py();//朋友对象有了

//创建对象的同时交朋友
my m2 = new my(f);//把朋友给传过来了


//创建一个自己对象
my m = new my（）;//自己对象
/
/面前没有交朋友，自己是自己。朋友是朋友

//交朋友
m.f = f ;//把朋友的地址给你了

   }
}

class py{}
 */
public class Customer{
    //    ChinaCooker cc;写死了
    private caidan cai;//private封装
    //    构造方法 无参
    public Customer(){
    }
    public Customer(caidan cai){
        this.cai = cai;
    }
    //    有参
    public void setCai(caidan cai){
        this.cai = cai;
    }
    public caidan getCai(){
        return cai;
    }
//提供点草的方法
    public void order(){
//        先拿到菜单
//用get方法
//        caidan cai = this.getCai();
//        直接掉
        cai.xhs();
        cai.yxrs();

    }
}
