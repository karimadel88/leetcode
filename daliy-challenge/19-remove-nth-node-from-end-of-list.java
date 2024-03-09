class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getLength(head);
        int target = size - n;
        if (target == 0) return head.next;
        
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while (i < target) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        
        prev.next = curr.next;
        return head;
    }

    public int getLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}