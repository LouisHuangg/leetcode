package LinkedList.delete;

import LinkedList.traversal.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicateSolution {
    //删除重复元素
    public ListNode deleteDuplicate(ListNode head){
        //一次遍历 这方法看了一点题解
        if(head == null){
            return head;
        }
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicate2(ListNode head){
        //自己写的 也过了 但是比上面的方法慢 这种还用集合 有点脱裤子放屁了
        Set<Integer> numsSet = new HashSet<Integer>();
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while(pre.next != null){
            if(numsSet.contains(pre.next.val)){
                pre.next = pre.next.next;
            }else{
                numsSet.add(pre.next.val);
                pre = pre.next;
            }
            //HashSet的add方法不会添加重复元素
        }
        return dummyNode.next;
    }
}
