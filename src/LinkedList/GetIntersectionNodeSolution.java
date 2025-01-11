package LinkedList;

public class GetIntersectionNodeSolution {
    //找相交链表的相交节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode p1 = headA;
        ListNode p2 = headB;

        //找到headA 和 headB 相同的节点就返回
        //只要有一个相同，就满足相交的条件
        while(p1 != p2){
            if(p1 == null)  p1 = headB;
            else p1 = p1.next;
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }
}
