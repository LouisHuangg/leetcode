package LinkedList;

import javax.swing.event.ListDataEvent;

public class SwapPairsSolution {
    //翻译
    public ListNode swapPairs(ListNode head){
        //定义虚拟头结点方便交换
        ListNode dumyNode = new ListNode(-1);
        dumyNode.next = head;
        ListNode cur = dumyNode;
        while(cur.next != null && cur.next.next != null){
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            cur.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            cur = cur.next.next;
        }
        return dumyNode.next;
    }
}
