class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                res[0] = i + 1;
                res[1] = map.get(diff);
            }
            map.put(nums[i] , i + 1);
        }
        Arrays.sort(res);
        return res;
    }
}
