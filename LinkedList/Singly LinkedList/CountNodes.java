public class CountNodes {
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
	
	static int getCountItr(Node head){
		int count =0;
		while(head!=null){
			head=head.next;
			count++;
		}
		return count;
	}
	
	static int getCountRec(Node head){
		if(head==null)
			return 0;
		return 1+getCountRec(head.next);
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
	System.out.println(getCountItr(head));
	System.out.println(getCountRec(head));
    }
}
