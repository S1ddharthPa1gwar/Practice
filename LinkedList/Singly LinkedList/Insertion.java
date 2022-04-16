public class Insertion {
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
	
	static  Node insertAtBeginning(Node head, int x){
		Node temp = new Node(x);
		temp.next=head;
		return temp;
	}
	
	static  Node insertAtEnd(Node head, int x){
		Node temp = new Node(x);
		if(head==null)
			return temp;	
		Node cur = head;
		while(cur.next!=null)
			cur=cur.next;
		cur.next=temp;
		return head;
	}
		
    public static void main(String[] args) {
        add(15);
        add(25);
        add(35);
        add(45);
        add(55);
        add(65);
        add(75);
        printList(head);
//        printList(insertAtBeginning(head,001));
//        printList(insertAtBeginning(head,11));
//        printList(insertAtBeginning(head,111));
        printList(insertAtEnd(head,001));
        printList(insertAtEnd(head,011));
        printList(insertAtEnd(head,111));        
    }
}
