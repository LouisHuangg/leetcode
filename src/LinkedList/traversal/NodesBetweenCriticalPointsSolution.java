package LinkedList.traversal;

public class NodesBetweenCriticalPointsSolution {
    //一道普通的模拟题
    public int[] nodesBetweenCriticalPoints(ListNode head){
        int max = -1, min = -1;
        int first = -1, last = -1, pos = 0;//first代表第一个极值点 用于记录最大 last代表当前的前一个极值点 用于记录最小
        //这里的循环条件 最后一个节点不可能是极值点 因此不考虑最后一个节点
        while(head.next.next != null){
            int p = head.val;
            int c = head.next.val;
            int n = head.next.val;
            //进入代表是极值点
            if((c > p && c > n) || (c < p && c < n)){
                //当前没有第一个 记录第一个位置
                if(first == -1){
                    first = pos;
                }
                //不等于 -1 说明前面以及有极值点了，可以计算大小了
                if(last != -1){
                    //这里有点细 把min第一次记录时也包括进去了
                    min = min == -1 ? pos - last : Math.min(min,pos - last);
                    max = Math.max(max, pos - first);
                }
            }
            head = head.next;
            ++pos;
        }
        return new int[]{min, max};
    }
}
