
public class LinkedListMain {
	
	public static void main(String [] args){
		Stack s  = new Stack();
		s.push(new Node(3));
		s.push(new Node(1));
		s.push(new Node(4));
		s.push(new Node(6));
		s.print();
	}

}


class Stack{
	Node top;
	
	public Node peek(){
		if(top != null){
			return top;
		}
		return null;
	}
	
	public Node pop(){
		if(top == null){
			System.out.println("Stack empty");
			return null;
		}else{
			Node temp = new Node(top.val);
			top = top.next;
			return temp;
		}
	}
	
	public void push(Node n){
		if(n != null){
			n.next = top;
			top = n;
		}
	}
	
	
	public void print(){
		if(top == null){
			System.out.print("Stack empty");
		}
		Node temp = top;
		while(temp.next != null){
			System.out.print(temp.val + "  ");
			temp = temp.next;
		}
		System.out.print(temp.val);
		System.out.println("");
	}
}

class Queue{
	Node first, last;
	
	public void enqueue(Node n){
		if(first == null){
			first = last = n;
		}else{
			last.next = n;
			last = n;
		}
	}
	
	public Node dequeue(){
		if(first == null){
			System.out.println("Queue is empty");
			return null;
		}
		else{
			Node temp = first;
			first = first.next;
			return temp;
		}
	}
}
