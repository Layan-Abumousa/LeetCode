class Solution {
    public String convertToTitle(int c) {
       
        StringBuilder res = new StringBuilder();
        while (c > 0) {
            c--; 
            int ch = c % 26;
            res.insert(0, (char) (ch + 'A')); 
            c /= 26;
        }
        
        return res.toString();

    }
}
