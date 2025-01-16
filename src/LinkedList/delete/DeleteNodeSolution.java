package LinkedList.delete;

import LinkedList.traversal.ListNode;

public class DeleteNodeSolution {
    //删除一个节点 但是不能访问到链表的头结点
    public void deleteNode(ListNode node){
        //传统的方法是通过调整删除节点的前驱节点的关系来删除节点
        //但这里不能这样 由于只能访问到node及以后的节点
        //可以把下一个节点的值赋给该节点 再删除下一个节点即可实现删除该节点的效果
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
