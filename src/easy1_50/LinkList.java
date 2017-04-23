/**
 * 55.59%
 * */
package easy1_50;

public class LinkList {
	
	private Node head = new Node(0);
	
	
	public class Node{
		int val;
		Node next;
		public Node(int x){
			this.val = x;
		}
	}
	public void insert(int val){
		Node oldHead = head;
		head = new Node(val);
		head.next = oldHead;
	}
	public void print()
	{
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
			
	}
	public Node remove(int n){
		int i = 1;
		//Node oldHead = new Node(100);
		
		Node x1 = new Node(100);
		Node x2 = new Node(100);
		Node x3 = new Node(100);
		x1.next = head;
		x2.next = head;
		x3.next = head;
		while(x1 != null )
		{
			
			if (i > n+1) x2 = x2.next;
			x1 = x1.next;
			i++;
			
		}
		
		x2.next = x2.next.next;
		System.out.println("i" + "=" +i);
		if (n == i-2) head = head.next;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList ls = new LinkList();
		ls.insert(1);
		ls.insert(2);
		//ls.insert(3);
		//ls.insert(4);
		//ls.insert(5);
		ls.remove(3);
		//System.out.println(ls.head.val);
		ls.print();
		
	}

	
}
