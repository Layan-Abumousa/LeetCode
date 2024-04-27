class Solution {
    public char findTheDifference(String s, String t) {
     return (char) (t.chars().sum() - s.chars().sum());
    }
}
