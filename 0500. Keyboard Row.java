class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        
        for (String word: words) {
            boolean inRow = true;
            int row = -1;
            char[] chars = word.toLowerCase().toCharArray();
            
            for (int i=0; i<rows.length; i++) {
                if (rows[i].indexOf(chars[0]) != -1) {
                    row = i;
                    break;
                }
            }
            for (char c : chars) {
                if (rows[row].indexOf(c) == -1) {
                    inRow = false;
                    break;
                }
            }
            if (inRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
