class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;

        int count = 0;
        ListNode node = head;

        while(node != null && count < k){
            node = node.next;
            count++;
        }        

        if(count == k){
            ListNode prev = reverseKGroup(node, k);

            while(count-- > 0){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
        return head;
    }
}