class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n ==  1) return null;

        int count = 0;
        ListNode current = head;

        while(current != null){
            count++;
            current = current.next;
        }        

        if(n == count) return head.next;

        current = head;
        for(int i=1; i<count-n; i++){
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}