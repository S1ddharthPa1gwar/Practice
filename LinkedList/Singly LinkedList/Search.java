public class Search {
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
	
	static boolean searchItr(Node head,int val){
		while(head.val!=val && head!=null)
			head=head.next;
		if(head.val==val)
			return true;
		return false;
	}

	static boolean searchRec(Node head,int val){
		if(head==null)
			return false;
		if(head.val==val)
			return true;
		return searchRec( head.next, val);
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
        System.out.println(searchItr(head,45));
        System.out.println(searchRec(head,85));
    }
}
