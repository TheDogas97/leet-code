class Solution {

    private char[] addToArray(char[] l, char c) {
        if (l == null)
            return new char[] { c };
        else {
            l = Arrays.copyOf(l, l.length + 1);
            l[l.length - 1] = c;
            return l;
        }
    }

    public boolean inArray(char[] l, char c) {
        if (l == null)
            return false;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == c)
                return true;
        }

        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 1, temp = 0, i = 0, j = 0;

        char[] list;

        if (s.length() == 0)
            return 0;

        for (i = 0; i < s.length(); i++) {
            list = null;
            for (j = i; j < s.length(); j++) {
                if (!inArray(list, s.charAt(j)))
                    list = addToArray(list, s.charAt(j));
                else
                    break;
            }
            if (list.length > max)
                max = list.length;
        }

        return max;
    }
}
