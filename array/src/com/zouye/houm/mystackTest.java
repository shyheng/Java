package com.zouye.houm;

public class mystackTest {
    public static void main(String[] args) {
//        创建一个栈对象，初始化容量为10个
        mystack s = new mystack();
        //调方法压栈，Ctrl+D
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());//最后压入，最先弹出来（符合栈的数据结构）
//        压栈失败
        s.push(new Object());
//        弹栈
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
