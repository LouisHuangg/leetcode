package LinkedList;

public class ReverseListSolution {
    //双指针翻转链表
    public ListNode reverseList1(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    //递归法
    public ListNode reverseList2(ListNode head){
        return reverse(head, null);
    }

    //实际上是基于双指针改写的
    public ListNode reverse(ListNode cur, ListNode pre){
        if (cur == null)    return pre;
        ListNode tmp = cur.next;
        cur.next = pre;
        pre = cur;
        return reverse(tmp, pre);
    }
}
