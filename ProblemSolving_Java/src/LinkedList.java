
public class LinkedList {
	
	Node head;
	
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.add(new Node(1));
		l.add(new Node(3));
		l.add(new Node(2));
		l.add(new Node(9));
		l.add(new Node(6));
		l.add(new Node(8));
		l.print();
	}
	
	public LinkedList(){
		head = null;
	}

	public void add(Node n){
		Node temp = head;
		if(temp == null){
			head = n;
			head.next = null;
		}
		else{
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = n;
			n.next = null;
		}
	}
	
	public void print(){
		Node temp = head;
		while(temp.next != null){
			System.out.print(temp.val + "  ");
			temp = temp.next;
		}
		System.out.print(temp.val);
	}
}
