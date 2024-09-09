/*package linkedList;
class Node
{
    int data;
    Node next;
    Node(int d) {
    	data = d; 
    	next = null; 
    }
} 

class Sol{
	 int getKthFromLast(Node head, int k) {
		 Node temp = head;
		 int count = 0;
		 while(temp != null) {
			 count++;
		 }
		 if (k > count) {
	            return -1;
	        }

		 int position = (count-k)+1;
		 Node current = head;
		 for (int i = 1; i < position; i++) {
	            current = current.next;
	        }
	        return current.data;
	    }
}

public class Kth_from_End_of_Linked_List {
	public static void main(String[] args) {
		 	Node head = new Node(10);
	        head.next = new Node(20);
	        head.next.next = new Node(30);
	        head.next.next.next = new Node(40);
	        head.next.next.next.next = new Node(50);
	        
	        Sol obj = new Sol();
	        int k = 2;
	        int ans = obj.getKthFromLast(head, 2);
	        System.out.println(ans);
	        System.out.println("aaaaaaaaa");
	}

}
*/
package linkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Sol {
    
    int getKthFromLast(Node head, int k) {
        Node first = head;
        Node Second = head;
        for(int i=0; i<k; i++) {
        	if(first == null) {
        		return -1;
        	}
        	first = first.next;
        }
        while(first != null) {
        	first = first.next;
        	Second = Second.next;
        }
        
        return Second.data;
    }
}

public class Kth_from_End_of_Linked_List {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Sol sol = new Sol();

        int k = 5;
        int ans = sol.getKthFromLast(head, k);
        System.out.println(ans);
    }
}

