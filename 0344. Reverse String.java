class Solution {
    public void reverseString(char[] ch) {
        int s =0,e=ch.length-1;
        while(s<=e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
}
