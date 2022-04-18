import java.util.*;

public class RemoveDuplicateFromUnsorted {
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
	
	static void removeDuplicate(Node head){
		Node cur = head, temp=null;
		Set<Integer> set = new HashSet<>();
		while(cur!=null){
			if(set.contains(cur.val)){
				temp.next=cur.next;
			}
			else{
				set.add(cur.val);
				temp=cur;
			}			
			cur=cur.next;
		}
		printList(head);
	}
		
    public static void main(String[] args) {
        printList(head);
        add(15); add(25); add(35);
        add(75); add(45); add(65);
        add(15); add(25); add(55);
        add(75); add(85); add(55);
        add(95); add(25); add(65);        
        printList(head);
        removeDuplicate(head);        
    }
}
