public class Solution {
      boolean isPalindrome(String s) {
    int j = s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!= s.charAt(j--)) {
                return false;
            }
    }
        return true;
    }
    public int countSubstrings(String s) {
        int cc = 1;
        int c = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < s.length() - cc + 1; i++) {
                String ss = s.substring(i, i + cc);
                if (isPalindrome(ss)) {
                    c++;
                }
            }
            cc++;
        }
        return c;
    }

   
}
