class Solution {

    private int reverse(int i) {
        int reversed = 0, aux = 0, n = 1;

        while (i > 0) {
            reversed = reversed * 10 + (i % 10);
            i /= 10;
        }

        return reversed;
    }

    public boolean isPalindrome(int x) {
        return reverse(x) == x;
    }
}
