package ScrollWindow.constant;

public class NumOfSubArraysSolution {
    public int numOfSubArray(int[] arr, int k, int threshold){
        int res = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            sum += arr[i];
            if (i < k - 1){
                continue;
            }
            if(sum >= threshold * k){
                res++;
            }
            sum -= arr[i - k + 1];
        }
        return res;
    }
}
