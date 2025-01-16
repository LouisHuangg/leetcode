package LinkedList.delete;

import LinkedList.traversal.ListNode;

import java.util.HashSet;
import java.util.Set;

public class ModifiedListSolution {
    //删除链表元素 经典题 虚拟头结点解决
    public ListNode modifiedList(int[] nums, ListNode head){
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre = dummyNode;
        //对于删除的题 一般都是针对删除节点的前一个节点
        while(pre.next != null){
            if(numsSet.contains(pre.next.val)){
                pre.next = pre.next.next;
            }else{
                pre = pre.next;
            }
        }
        return dummyNode.next;
    }
}
