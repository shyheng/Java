/*
* 重写之后的方法不能比重写之前的方法抛出更多（更广泛的）的异常，可以更少
* */
class Animal{
    public void dos(){

    }
    public void doss() throws Exception{

    }
}

class Cat extends Animal{
  /*  public void dos() throws Exception{
     规定不能这么写,编译报错
    }*/

/*


//  编译正常
  public void doss(){

  }
*/
/*

//编译正常
public void doss() throws Exception{

}*/

/*
//编译正常
public void doss() throws NullPointerException{

}
*/

/*
* 总结异常的关键字
* 异常捕捉
* try
* catch
* finally
*
* throws 在方法声明位置上使用，表示上报异常信息给调用者
* throw手动抛出异常
*
* */
}