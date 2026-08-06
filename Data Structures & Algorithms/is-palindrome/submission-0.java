class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder rev = new StringBuilder(str).reverse();
        return rev.toString().equals(str);
    }
}
