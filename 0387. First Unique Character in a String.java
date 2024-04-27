class Solution {
    public static int[] freq(char arr[]){
     int freq[]= new int [26];
     for (int i = 0; i < arr.length; i++) {
         char ch = arr[i];
         freq[(int)(ch-'a')]++;
     }
     return freq;
 }
    public int firstUniqChar(String s) {
       int ch[]= freq(s.toCharArray());
        for (int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i)-'a']==1) {
                return(s.indexOf(s.charAt(i)));
            }
        }
     return -1;
}}
