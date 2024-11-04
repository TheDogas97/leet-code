class Solution {
    public int romanToInt(String s) {
        int decimal = 0;
        Map<Character, Integer> converter = new HashMap<>();

        converter.put('I', 1);
        converter.put('V', 5);
        converter.put('X', 10);
        converter.put('L', 50);
        converter.put('C', 100);
        converter.put('D', 500);
        converter.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && converter.get(s.charAt(i)) < converter.get(s.charAt(i + 1)))
                decimal -= converter.get(s.charAt(i));
            else
                decimal += converter.get(s.charAt(i));
        }

        return decimal;
    }
}
