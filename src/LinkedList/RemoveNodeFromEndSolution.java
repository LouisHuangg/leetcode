package LinkedList;

public class RemoveNodeFromEndSolution {
    //删除倒数第n个节点
    public ListNode removeNodeFromEnd(ListNode head, int n){
        ListNode dumyNode = new ListNode(-1);
        dumyNode.next = head;
        ListNode fast = dumyNode;
        ListNode slow = dumyNode;

        //让fast领先slow n+1 个节点 这样使slow指向被删除节点的前一节点
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        //双指针移动
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //如果slow下一个为null，说明被删除的节点不存在
        if(slow.next != null){
            slow.next = slow.next.next;
        }
        return dumyNode.next;
    }
}
