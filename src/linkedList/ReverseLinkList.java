package linkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Reverse{
	 Node reverseList(Node head) {
		 Node left = head;
		 Node right = head;
		 int leng = 0;
		 while(right.next != null) {
			 right = right.next;
			 leng++;
		 }
		 
		 for(int i=0; i<leng/2; i++) {
			 int temp = left.data;
			 left.data = right.data;
			 right.data = temp;
			 
			 left = left.next;
			 
			 Node current = head;
			 for(int j=0; i<leng-i-1; j++) {
				 current = current.next;
			 }
			 right =  current;
		 }
		 return head;
	}
	//using stack 
	 Node reverseList(Node head) {
		 Stack<Integer> s = new Stack<>();
		 Node curr = head;
		 while(curr != null){
			 s.push(curr.data);
			 curr = curr.next;
		 }
		 curr = head;
		 while(curr != null){
			 curr.data = s.pop();
			 curr = curr.next;
		 }
		 return head;
	 }
}

public class ReverseLinkList {
	public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Reverse sol = new Reverse();
	}

}
