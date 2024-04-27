class Solution {
       public static boolean is(String s ){
       String ss = "";
       for (int i =  s.length() -1 ; i >=0; i--) {
          ss+=s.charAt(i);
       }
       if (s.equals(ss)) {
           return true;
       }
       return false;
   }
    public String firstPalindrome(String[] words) {
         for(int i = 0 ; i < words.length ; i++){
             if(is(words[i]))return words[i];
         }
         return "";
    }
}
