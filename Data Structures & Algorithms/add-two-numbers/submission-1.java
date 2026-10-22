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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res = new ListNode(0);
        ListNode home = res;
        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            res.next = new ListNode(sum % 10);
            carry = sum >= 10 ? 1 : 0;
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode fill = l1 == null ? l2 : l1;
        while(fill != null) {
            int sum = fill.val + carry;
            res.next = new ListNode(sum % 10);
            carry = sum >= 10 ? 1 : 0;
            res = res.next;
            fill = fill.next;
        }
        if(carry == 1){
            res.next = new ListNode(1);
        }
        return home.next;
    }
}
