class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}