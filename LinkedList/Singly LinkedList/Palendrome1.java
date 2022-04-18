// In this problem we have checked using stack.
import java.util.*;

public class Palendrome1 {
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
		Stack<Character> stack = new Stack<>();
		Node temp = head;
		while(temp!=null){
			stack.push(temp.val);
			temp=temp.next;
		}
		temp = head;
		while(temp!=null){
			if(stack.pop()!=temp.val)
				return false;
			temp=temp.next;
		}
		return true;
	}
		
    public static void main(String[] args) {
        printList(head);
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
