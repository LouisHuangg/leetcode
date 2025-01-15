package LinkedList;

public class SplitListToPartsSolution {
    //模拟题 算是能靠自己写出来的一道题 但还有一些小细节要注意
    public ListNode[] splitListToParts(ListNode head, int k){
        ListNode tmp = head;
        int sum = 0;
        while(tmp != null){
            sum++;
            tmp = tmp.next;
        }
        int num = sum / k;
        int remain = sum % k;
        ListNode[] res = new ListNode[k];
        ListNode cur = head;
        for(int i = 0; i < k && cur != null; ++i){
            res[i] = cur;
            //记录当前部分的大小 即是否要加1
            //因为i从0开始 这里不用等于
            int size = i < remain ? num + 1 : num;
            for(int j = 1; j < size; ++j){
                cur = cur.next;
            }
            //出来后代表一个部分已经完成 下面是分割
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return res;
    }
}
