package ScrollWindow.variable;

public class MinSubArrayLenSolution {
    public int minSubArrayLen(int[] nums, int target){
        int n = nums.length;
        int res = n + 1;
        int left = 0;
        int sum = 0;
        //遍历右端点
        for(int right = 0; right < n; right++){
            sum += nums[right];
            //得到范围的情况下缩小左端点
            while(sum >= target){
                res = Math.min(res,right - left + 1);
                sum -= nums[left++];
            }
        }
        return res;
    }
}
