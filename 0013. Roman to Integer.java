class Solution {
    public int romanToInt(String s) {
        if (s.isEmpty())
            return 0;
        Map<Character, Integer> m = new HashMap<>();
        int num = 0;

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (num == 0)
                num += m.get(s.charAt(i));
            else if (m.get(s.charAt(i)) >= m.get(s.charAt(i + 1))) {
                num += m.get(s.charAt(i));
            } else {
                num -= m.get(s.charAt(i));
            }
        }
        return num;
    }
}
