class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int curr = 1;
        for(int i = 0 ; i < nums.length ; i++){
            curr *= nums[i];
            pre[i] = curr;
        }
        curr = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            curr *= nums[i];
            post[i] = curr;
        }
        
        curr = 1;
        res[0] = post[1];
        res[res.length - 1] = pre[res.length - 2];
        for(int i = 1 ; i < res.length - 1; i++){
            res[i] = pre[i - 1] * post[i + 1];
        }
        return res;
    }
}  
