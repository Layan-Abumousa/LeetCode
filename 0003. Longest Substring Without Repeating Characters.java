class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        int start = 0;
        int end = 0;

        while (end < n) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            charIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);

            end++;
        }

        return maxLength;
    }
}
