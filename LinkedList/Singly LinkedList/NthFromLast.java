public class NthFromLast {
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
	
	static int getNthFromLast(Node head,int pos){
		int len =0;
		Node cur = head;
    		while(cur!=null){
        		cur=cur.next;
        		len++;
    		}
    		if(len-pos+1<1)
        	return -1;
    		cur = head;
    		for(int i=1;i<len-pos+1;i++)
        	cur=cur.next;
        	return cur.val;
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
        System.out.println(getNthFromLast(head,1));
        System.out.println(getNthFromLast(head,2));
        System.out.println(getNthFromLast(head,3));        
        System.out.println(getNthFromLast(head,4));
        System.out.println(getNthFromLast(head,5));
        System.out.println(getNthFromLast(head,6));
        System.out.println(getNthFromLast(head,7));        
        System.out.println(getNthFromLast(head,8));
    }
}
