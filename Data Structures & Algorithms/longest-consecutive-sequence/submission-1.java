class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int index = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int curr = i;
                int length = 1;
                while(set.contains(curr + 1)){
                curr++;
                length++;
                }
                max = Math.max(max , length);
            }
            
        }
        return max;
        
    }
}
