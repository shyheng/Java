package collection.List.danlink;
/*
* 链表类
* */
public class Link<E> {


    //    头节点
    Node head = null;

    int size = 0;

    public int size (){
        return size;
    }

//    向链表中添加元素的方法,(向末尾添加)
//    public void add(Object shy){//shy一个数据

//        使用泛型
        public void add(E shy){


        //创建一个新节点对象
//        让之前单链表的末尾节点next指向新节点对象
//        有可能这个这个元素是第一个，第二个，第三
        if (head == null) {
//            说明没有节点
//            new一个新的节点，作为头节点
//            现在的节点是头，也是未
            head =new Node(shy,null);
        }else {
//            说明头不是空
//            头节点已经存在
//            找出末尾节点，让当前的节点是末尾节点
            Node lowo = findLast(head);
            lowo.next = new Node(shy,null);
        }
        size++;
    }

    /**
     * 这是一个专门找最后一个节点的方
     */
    private Node findLast(Node node) {
          if (node.next == null){
//              如果一个节点的next是null
//              说明就是最后一个节点
              return node;
          }
//          程序到这说明不是下一个，用递归，找
        return findLast(node.next);//递归算法
    }

    //    删除链表中某个元素数据方法
    public void remove(Object shy){

    }

//    修改链表中某个数据的方法
    public void modify(Object shy){

    }

//    查找链表中的某个方法
    public int find(Object shy){
        return 1;
    }
}
