package medium;

import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3}, l2 = {5, 6, 4};
        System.out.println(Arrays.toString(addTwoNumbers(l1, l2)));
    }

    public static int[] addTwoNumbers(int[] l1, int[] l2) {
        int n = l1.length, m = l2.length;

        int integer1 = 0;
        int integer2 = 0;

        int right = n - 1;
        while (right >= 0) {
            int temp = l1[right];
            right--;
            integer1 = integer1 * 10 + temp;
        }

        right = m - 1;

        while (right >= 0) {
            int temp = l2[right];
            right--;
            integer2 = integer2 * 10 + temp;
        }

        int sum = integer1 + integer2;
        String sumString = String.valueOf(sum);
        int sumLength = sumString.length();
        int[] returnValue = new int[sumLength];

        int i = sumLength - 1;
        for (char s : sumString.toCharArray()) {
            returnValue[i] = s - '0';
            i--;
        }

        return returnValue;
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


    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = l1 != null ? l1.val : null;
            int val2 = l2 != null ? l2.val : null;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

}
