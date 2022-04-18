public class Reverse2 {
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
	
	static Node reverse(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node rest = reverse(head.next);
		head.next.next=head;
		head.next=null;
		return rest;
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
        printList(reverse(head));
    }
}
