package 常用类.基本数据类型包装类;
//这个包装类自己的，实际不用
//因为8种数据类型sun写好了
public class myint {
    int value;
//    无参
    public myint(){

    }
//有参
    public myint(int value){
        this.value = value;
    }

//    重写toString
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
