package linkedList;

class Node {
	   int data;
	    Node next;
	    Node(int d)  { 
	    data = d;  next = null; 
    }
}

class Middle {
	int getMiddle(Node head) {
		if(head == null){
            return 0;
        }
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow.data;
	}

}

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        Middle sol = new Middle();

       // int k = 5;
        int ans = sol.getMiddle(head);
        System.out.println(ans);
    }
}
