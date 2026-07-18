class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode fast = head;

        while (n-- > 0) {
            fast = fast.next;
        }

        // remove first node
        if (fast == null) {
            return head.next;
        }

        ListNode slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}