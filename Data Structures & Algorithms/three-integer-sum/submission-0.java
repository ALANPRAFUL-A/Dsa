class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , i);
        }
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int sum = nums[i] + nums[j];
                if(map.containsKey(-1 * sum)){
                    int k = map.get(-1 * sum);
                    if(!set.contains(nums[i]+":"+nums[j]+":"+nums[k]) && k > i && k > j){
                        res.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                        set.add(nums[i]+":"+nums[j]+":"+nums[k]);                       
                    }
                }
            }
        }
        return res;
    }
}
