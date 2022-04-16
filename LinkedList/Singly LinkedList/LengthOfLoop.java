public class LengthOfLoop {
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
	
	static int countNodesinLoop(Node head){
			Node slow=head,fast=head;
		while(fast!=null  && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				break;
		}
		if(fast==null  || fast.next==null)
		    return 0;
		int count=1;
		while(slow.next!=fast){
		    count++;
		    slow=slow.next;
		}
		
		return count;
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
        Node cur = head;
       cur.next.next.next.next.next.next=cur.next.next;
 	System.out.println(countNodesinLoop(head));
       printList(head);        
    }
}
