package medium;

import java.util.Arrays;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5};
        int n = 2;
        System.out.println(Arrays.toString(removeNthFromEnd(head, n)));
    }

    // by list node
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node
        slow.next = slow.next.next;

        return dummy.next;
    }


    // by array
    public static int[] removeNthFromEnd(int[] head, int n) {
        int length = head.length;
        int[] res = new int[length - 1];

        int count = res.length - 1;
        for (int j = length - 1; j >= 0; j--) {
            if (length - j != n) {
                res[count--] = head[j];
            }
        }

        return res;
    }

    // with node
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
