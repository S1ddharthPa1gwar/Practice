//using stack
import java.util.*;
public class Reverse3 {
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
		Stack<Node> stack = new Stack<>();
		Node cur=head;
		while(cur.next!=null){
			stack.add(cur);
			cur=cur.next;
		}
		head=cur;
		while(!stack.isEmpty()){
			cur.next=stack.peek();
			stack.pop();
			cur=cur.next;
		}	
		cur.next=null;
		return head;
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
