class Solution {
    public String longestCommonPrefix(String[] str) {
                String s = str[0];
     String x="";
         if (str.length == 1 )return str[0];
         String res = "";
        for (int i = 0; i < s.length(); i++) {
             x = s.substring(0,i+1);
             int c=0;

            for (int j = 0; j < str.length; j++) {
                if (str[j].indexOf(x)==s.indexOf(x)) {
                   c++;
                }
            }
            if(c==str.length)res=x;
        }
        return res;
    }
}
