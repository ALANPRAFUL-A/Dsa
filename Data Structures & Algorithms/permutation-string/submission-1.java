class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq = new int[26];
        int[] temp = new int[26];
        for(int i = 0 ;  i < s1.length() ; i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int len = s1.length();
        int left = 0;
        for(int right = 0 ; right < s1.length() ; right++){
            temp[s2.charAt(right) - 'a']++;
        }
        boolean flag1=true;
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] != temp[i]){
                flag1 = false;
                break;
            }
        }
        if(flag1) return flag1;
        for(int right = len ; right < s2.length() ; right++){
            temp[s2.charAt(right) - 'a']++;
            temp[s2.charAt(left)-'a']--;
            left++;
            boolean flag = true;
            for(int i = 0 ; i < 26 ; i++){
                if(freq[i] != temp[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) return flag;
        }
        return false;
        
    }
}
