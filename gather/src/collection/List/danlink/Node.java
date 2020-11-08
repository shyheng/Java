package collection.List.danlink;
/*
 *单链表中的节点
 * 节点是单向链表中基本的单元
 * 每一个节点Node都有两个属性
 *   一个属性是：存储的数据
 *   另一个属性是：下一个节点的内存地址
 * */
public class Node {
    //    存储数据
    Object shy;



        //    下一个节点的内存地址
        Node next;
//构造方法
        public Node(){

        }

        public Node(Object shy,Node next){
            this.shy =shy;
            this.next= next;
        }


}
