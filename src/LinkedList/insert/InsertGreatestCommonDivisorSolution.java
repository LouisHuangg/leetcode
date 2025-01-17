package LinkedList.insert;

import LinkedList.traversal.ListNode;

public class InsertGreatestCommonDivisorSolution {
    //在原链表的两个节点中插入最大公约数
    //简单的链表插入题 难在求最大公约数
    public ListNode insertGreatestCommonDivisor(ListNode head){
        ListNode cur = head;
        while(cur.next != null){
            ListNode next = cur.next;
            ListNode newNode = new ListNode(getNumber(cur.val,next.val));
            newNode.next = next;
            cur.next = newNode;
            cur = next;
        }
        return head;
    }

    public int getNumber(int a, int b){
        int tmp;
        if(a < b){
            tmp = a;
            a = b;
            b = tmp;
        }
        while( b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
