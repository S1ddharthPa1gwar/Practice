public class Occourance {
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
		
	static int countItr(Node head,int val){
		Node cur = head;
		int count =0;
		while(cur!=null){
			if(cur.val==val)
				count++;
			cur=cur.next;
		}
		return count;
	}	

	static int countRec(Node head,int val){
		if(head==null)
			return 0;
		if(head.val==val)
			return 1+ countRec(head.next, val);
		return countRec(head.next, val);
	}	

		
    public static void main(String[] args) {
        printList(head);
        add(15);add(5);add(25);
        add(25);add(25);add(15);
        add(15);add(15);add(55);
        add(45);add(35);add(85);
        add(15);add(25);add(55);
        add(15);add(15);add(45);
        add(75);add(45);add(65);
        printList(head);
        System.out.println(countRec(head,15));
        System.out.println(countRec(head,45));
        System.out.println(countRec(head,65));
        System.out.println(countRec(head,85));
        System.out.println(countItr(head,15));
        System.out.println(countItr(head,45));
        System.out.println(countItr(head,85));
        
    }
}
