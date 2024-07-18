/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public int getDecimalValue(ListNode head) {
        ListNode first = reverse(head);
        int base =1;
        int numval = 0;
        while(first != null)
        {
            if(first.val == 1 )
            {
                numval = numval + base;
            }
            base = base*2;
            first = first.next;
        }
        return numval;
    }
}