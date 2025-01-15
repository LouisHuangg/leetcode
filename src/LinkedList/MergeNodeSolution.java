package LinkedList;

//链表的模拟题掌握程度还不理想 还是要多练啊
public class MergeNodeSolution {
    //模拟题
    public ListNode mergeNode(ListNode head){
        ListNode dummyNode = new ListNode();
        //定义一个新节点作为返回答案链表的尾节点 为了方便节点的添加 因此是尾节点
        ListNode tail = dummyNode;
        int sum = 0;
        ListNode cur = head.next;
        while(cur != null){
            if(head.val == 0){
                tail.next = new ListNode(sum);
                tail = tail.next;
                //添加到新链表后把原来的sum置零 重新开始计数
                sum = 0;
            }else{
                sum += cur.val;
            }
            cur = cur.next;
        }

        return dummyNode.next;
    }
}
