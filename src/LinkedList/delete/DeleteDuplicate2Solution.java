package LinkedList.delete;

import LinkedList.traversal.ListNode;

public class DeleteDuplicate2Solution {
    public ListNode deleteDuplicate2(ListNode head){
        if(head == null){
            return null;
        }
        //跟上一题的区别 只要重复就删除
        //由于头结点也可能会删除 这里必须要用虚拟头节点了
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while(pre.next != null && pre.next.next != null){
            if(pre.next.val == pre.next.next.val){
                //区别主要在这 要再用一层循环删除连续的节点
                int deleteNum = pre.next.val;
                while(pre.next != null && pre.next.val == deleteNum){
                    pre.next = pre.next.next;
                }
            }else{
                pre = pre.next;
            }
        }
        return dummyNode.next;
    }
}
