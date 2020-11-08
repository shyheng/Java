package 常用类.基本数据类型包装类;
/*前面加java.lang.Byte
* 8种数据类型对应的包装类
* 基本类型　 	包装器类型
boolean 	Boolean（父类Object）
char 	Character（父类Object）
int 	Integer（父类Number）
byte 	Byte（父类Number）
short 	Short（父类Number）
long 	Long（父类Number）
float 	Float（父类Number）
double 	Double（父类Number）
*
* 重点以java.lang.Integer为代表
*
* 8种数据类型，6个都是Number父类，所以先研究Number
* Number是一个抽象类，无法实例化对象
*
* Number类中
* byte byteValue()
返回指定号码作为值 byte ，这可能涉及舍入或截断。
abstract double doubleValue()
返回指定数字的值为 double ，可能涉及四舍五入。
abstract float floatValue()
返回指定数字的值为 float ，可能涉及四舍五入。
abstract int intValue()
返回指定号码作为值 int ，这可能涉及舍入或截断。
abstract long longValue()
返回指定数字的值为 long ，可能涉及四舍五入或截断。
short shortValue()
返回指定号码作为值 short ，这可能涉及舍入或截断。

* 这些方法负责拆箱
* */
public class in {
    public static void main(String[] args) {
//        123这个基本数据类型    装换    为引用数据类型（装箱）
        Integer i = new Integer(123);
//转换
        float f = i.floatValue();
        System.out.println(f);//123.0

//        将引用数据类型 转换为 基本数据类型（拆箱）
        int re = i.intValue();
        System.out.println(re);//123
    }
}
