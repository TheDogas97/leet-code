import java.math.BigInteger;

class Solution {
    private BigInteger listNodeToInt(ListNode l) {
        BigInteger i = BigInteger.ZERO, n = BigInteger.ONE;
        while (l != null) {
            i = i.add(BigInteger.valueOf(l.val).multiply(n));
            n = n.multiply(BigInteger.TEN);
            l = l.next;
        }
        return i;
    }

    private ListNode intToListNode(BigInteger i) {
        if (i.equals(BigInteger.ZERO)) return new ListNode(0);
        ListNode head = null, current = null;
        while (i.compareTo(BigInteger.ZERO) > 0) {
            ListNode newNode = new ListNode(i.mod(BigInteger.TEN).intValue());
            if (head == null) head = newNode;
            else current.next = newNode;
            current = newNode;
            i = i.divide(BigInteger.TEN);
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return intToListNode(listNodeToInt(l1).add(listNodeToInt(l2)));
    }
}
