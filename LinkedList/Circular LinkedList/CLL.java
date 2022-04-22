public class CLL {
//	static Node head;
	static Node tail;
	class Node{
		int val;
		Node next;
		Node(int x){
			this.val= x;
			this.next=null;
		}
	}
	
	void push(int x){
		Node temp = new Node(x);
		if(tail==null){
			tail=temp;
			tail.next=tail;
		}
		temp.next=tail.next;
		tail.next=temp;
		tail=tail.next;		
	}
}
