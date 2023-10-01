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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode curr = head;
        ListNode second = head.next;
        while(curr.next!=null)
        {
            ListNode temp = new ListNode(gcd(curr.val,second.val));
            curr.next = temp;
            temp.next = second;
            curr = second;
            second = second.next;
        }
        return head;
    }
    public int gcd(int a, int b)
    {
        int hcf = 1; 
                int x = Math.max(a,b);
                for(int i=1;i<=x;i++){
                    if(a%i==0 && b%i==0){
                        hcf = Math.max(i, hcf);
                    }
                }
                return hcf; 
        
    }
}