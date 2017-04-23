/*
 * 75%
 * */

package easy1_50;

public class SwapNodesinPairs_24 {
	
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre1 = new ListNode(0);
        ListNode pre2 = pre1;
        pre1.next = head;
        while (head != null && head.next != null){
            pre1.next = head.next;
            ListNode l1 = head; ListNode l2 = head.next;
            l1.next = l2.next; l2.next = l1;
            head = l2; head.next = l1;
            pre1 = pre1.next.next;
            head = head.next.next;
        }
        return pre2.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
