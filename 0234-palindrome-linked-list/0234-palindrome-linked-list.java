class Solution {
    public ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode middle = findMiddle(head);
        ListNode secondhalf = reverse(middle);

        ListNode firsthalf = head;
        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val) return false;
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}