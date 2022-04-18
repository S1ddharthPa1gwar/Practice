public class Segregate {
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
	
	static Node segregate(Node head){
        Node en =null,eh=null;
        Node on = null,oh=null;
        Node cur = head;
        while(cur!=null){
            if(cur.val%2==0){
                if(en==null){
                    en=cur;
                    eh=en;
                }
                else{
                    en.next = cur;
                    en=en.next;
                }
            }
            else{
                if(on==null){
                    on=cur;
                    oh=on;
                }
                else{
                    on.next=cur;
                    on=on.next;
                }
            }
            cur=cur.next;
        }
        if(eh==null || oh==null)
            return head;
        en.next=oh;
        on.next=null;
        return eh;
    }
		
    public static void main(String[] args) {
        printList(head);
        add(10);
        add(25);
        add(30);
        add(45);
        add(50);
        add(65);
        add(70);
        printList(head);
        printList(segregate(head));
    }
}
