class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int count = 0;
        ListNode curr = head;

        while(curr != null){
            count++;
            curr = curr.next;
        }
        int size = count / 2;
        curr = head;
        for(int i=1; i<size; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}