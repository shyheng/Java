/*
编写程序，使用一维数组，模拟数据结构
要求
1 这个栈可以存储任何引用类型的 数据
2 在栈中提供push方法模拟压栈。（栈满了，要有提示信息)
3 在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息)
4 编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作
5假设栈的默认初始化容量是10，（请注意无参构造方法的编写方式）
 */
public class mystack {
//    向栈中存储元素，我们使用一维数组
//    选择object类型数组，因为这个栈可以存储java中任何引用数据类型
//    超级父类（object），String父类是object
    private Object[] elements;
//set和get或许用不上，但是得写，习惯，封装完了，得有出口

    //    栈帧，永远指向栈顶部元素
//    最初的栈是空的，
//    private int index = 0;//如果index采用0，表示栈帧指向了代表顶部元素的上方
//    private int index = -1;//index采用-1，表示了栈帧指向了顶部元素
    private int index;

    //构造方法 无参方法默认10个
    public mystack(){
//        一维数组动态初始化
//        默认初始化容量是10
        this.elements = new Object[10];
//        给index初始化
        this.index = -1;
    }

//    压栈方法
    public void push(Object obj) throws MyStackOperationException {
        if (index >= elements.length - 1){
//            改良之前
   /*         System.out.println("栈已满");
            return;*/

/*//            创建异常对象
            MyStackOperationException e = new MyStackOperationException("栈已满");

//            手动将异常抛出去
            throw e;//捕捉没有意义。自己new一个异常，自己抓，没有意义，栈已满的抛出去*/

//合并（手动抛异常）
            throw new MyStackOperationException("栈已满");
        }
//        程序到这。代表程序没满

//        向栈中加一个元素，栈帧向上移动一个位置
       /* index++;
        elements[index] = obj;//当index=9，错误*/
//        简写
        elements[++index] = obj;//++index先+后赋值
//      所有  System.out.println()方法执行时，如果出现引用，自动调用tostring方法
        System.out.println("压栈"+obj+"压栈成功，栈帧指向"+index);
    }

//弹栈,从数组中取元素
//
    public void pop() throws MyStackOperationException {
        if (index < 0 ){
 /*           System.out.println("栈以空");
            return;*/

// 改异常
            throw new MyStackOperationException("栈以空");
        }
//        到这栈没空
        System.out.print("弹栈"+elements[index]+"成功,");
        index--;
        System.out.println("栈帧指向"+index);
    }


    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }




}
