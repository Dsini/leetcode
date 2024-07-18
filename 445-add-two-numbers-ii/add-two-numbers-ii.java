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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode first = reverse(l1);
        ListNode second = reverse(l2);


        ListNode sum = null;
        int carry = 0;

        while(first != null || second != null || carry == 1)
        {
            int newval = carry;
            if(first != null)
            newval += first.val;
            if(second != null)
            newval += second.val;

            carry = newval/10;
            newval = newval%10;

            ListNode newNode = new ListNode(newval);
            newNode.next = sum;
            sum = newNode;

            if(first !=null)
            first = first.next;
            if(second !=null)
            second = second.next;
            
        }
        return sum;
    }
}