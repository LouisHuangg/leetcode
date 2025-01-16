package LinkedList.traversal;

public class GetDecimalValueSolution {
    //将二进制链表转为十进制
    //这题只是简单的遍历链表，难在二进制与十进制的转换
    //原先的方法是从低位到高位，但这种方法放在这里不合适
    //应该使用高位到地位的方法
    //即循环时每次乘2以达到升位的目的
    public int getDecimalValue(ListNode head){
        int res = 0;
        while(head != null){
            res += res * 2 + head.val;
            head = head.next;
        }
        return res;
    }
}
