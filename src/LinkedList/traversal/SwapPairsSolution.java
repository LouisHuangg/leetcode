package LinkedList.traversal;

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

    //递归
    public ListNode swapPairs2(ListNode head){
        //递归结束条件
        if(head == null || head.next == null) return head;
        ListNode next = head.next;

        //如何理解这段？ 将剩余的链表进行两两交换操作
        ListNode newNode = swapPairs2(next.next);
        next.next = head;
        head.next = newNode;
        return next;
    }
}
