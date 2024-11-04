class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = "";
        int size = 1;
        char tmp;

        while (!strs[0].equals("") && size <= strs[0].length()) {
            tmp = strs[0].charAt(size - 1);
            for (int index = 1; index < strs.length; index++) {
                if (strs[index].length() < size)
                    return ret;
                if (strs[index].charAt(size - 1) != tmp)
                    return ret;
            }
            ret += tmp;
            size++;
        }

        return ret;
    }
}
