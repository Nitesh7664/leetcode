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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Map<Integer, Boolean> map = new HashMap();
        for(int num: nums) {
            map.put(num, true);
        }
        ListNode newHead = head, temp = head, prevNode = null;
        while(temp != null) {
            if (map.get(temp.val) != null) {
                if(newHead.val == temp.val) {
                    newHead = temp.next;
                } else if(prevNode != null) {
                    prevNode.next = temp.next;
                } else {
                    prevNode = temp;
                }
            } else {
                prevNode = temp;
            }
            temp = temp.next;
        }
        return newHead;
    }
}