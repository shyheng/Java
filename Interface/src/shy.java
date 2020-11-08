/*
class nbl1 {
    public static void main(String[] args) {
        myth m = new myth();
        m.my(new shy(){
            public int sum(int a , int b){
                return a + b;
        }, 100, 200);
    }
}


//接口
interface shy {
//    抽象方法
    int sum(int a , int b);
}
*/
/*class shy1 implements shy{
//   对方法的实现
    public int sum(int a , int b){
        return a + b;
    }
}*//*



class myth{
//    求和
    public void my(shy w , int x , int y){
        int ret = w.sum(x,y);
        System.out.println(x + "+" + y + "=" + ret);
    }
}*/
/*
* 匿名内部类不建议使用
* 代码太乱
* 拿来装b可以
* 缺点，没有名字，不能重复使用
* 局部变量
*
* */
interface shy{
    int sum(int a, int b);
}







