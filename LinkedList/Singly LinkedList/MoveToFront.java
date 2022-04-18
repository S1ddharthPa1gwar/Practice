public class MoveToFront {
	static Node head=null;
	static Node tail=null;
	
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	static void add(int val){
		Node temp = new Node(val);
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			tail.next=temp;
			tail=tail.next;
		}
	}
	
	static void printList(Node head){
		Node temp =head;
		while(temp !=null){
			System.out.print(temp.val + " " );
			temp=temp.next;
		}
			System.out.println();
	}
	
/*	static Node moveToFront(Node head){
	Node temp = head;
	if(temp==null || temp.next==null)
		return temp;
	while(temp.next.next!=null)
		temp=temp.next;
	temp.next.next=head;
	head=temp.next;
	temp.next=null;
	return head;
	}	
*/
	
	static void moveToFront(Node head){
	Node temp = head;
	if(temp==null || temp.next==null)
		return;
	while(temp.next.next!=null)
		temp=temp.next;
	temp.next.next=head;
	head=temp.next;
	temp.next=null;
	printList(head);
	}
		
    public static void main(String[] args) {
        printList(head);
        add(15);
        add(25);
        add(35);
        add(45);
        add(55);
        add(65);
        add(75);
        printList(head);
//        printList(moveToFront(head));
	moveToFront(head);
    }
}
