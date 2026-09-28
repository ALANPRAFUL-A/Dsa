class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0 ; i < t.length() ; i++){
            int ch1 = s.charAt(i) - 'a';
            int ch2 = t.charAt(i) - 'a';

            arr1[ch1]++;
            arr2[ch2]++;

        }
        for(int i = 0 ; i < arr1.length ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
