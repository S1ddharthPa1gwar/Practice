// In this problem we have checked by reversing the LinkedList
import java.util.*;

public class Palendrome2 {
	static Node head=null;
	static Node tail=null;
	
	static class Node{
		char val;
		Node next;
		Node(char val){
			this.val = val;
			this.next = null;
		}
	}
	
	static void add(char val){
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
	
	static boolean isPalendrome(Node head){
		Node slow=head,fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		Node prev=null,cur=slow.next,next=cur.next;
		while(cur!=null){
			cur.next=prev;
			prev=cur;
			cur=next;
			if(next!=null)
			next=next.next;
		}
		slow.next=prev;
//		printList(head);
		fast=head;
		slow=slow.next;
		while(slow!=null){
			if(fast.val!=slow.val)
				return false;
			slow=slow.next;
			fast=fast.next;
		}
		return true;
	}
		
    public static void main(String[] args) {
        printList(head);
        add('r');
        add('r');
        add('a');
        add('d');
        add('a');
        add('r');
        add('r');
        printList(head);
        System.out.println(isPalendrome(head));
    }
}
