
public class deleteMN {
	
	public static void main(String args[]){
		deleteMN mn = new deleteMN();
		LinkedList l = new LinkedList();
		l.add(new Node(1));
		l.add(new Node(2));
		l.add(new Node(3));
		l.add(new Node(4));
		l.add(new Node(5));
		l.add(new Node(6));
		l.add(new Node(7));
		l.add(new Node(8));
		l.add(new Node(9));
		l.add(new Node(10));
		l.add(new Node(11));
		l.add(new Node(12));
		l.print();
		System.out.println();
		mn.deleteMN(l, 2, 3);
		System.out.println();
		l.print();
	}
	
	public void deleteMN(LinkedList l, int s, int r)
	{
		Node temp  = l.head;
		Node left = null;
		Node right = null;
		while(temp != null){
			while (s > 0 && temp!=null){
				System.out.print(" S " + temp.val + "  ");
				if(s == 1){
					left = temp;
				}
				temp = temp.next;
				s--;
			}

			while (r > 0 && temp !=null){
				//System.out.print(" D " + temp.val + "  ");
				temp = temp.next;
				if(temp == null){
					left.next = null;
				}
				r--;
			}
			if(r == 0){
				left.next = temp;
				r = 3;
				s = 2;
			}
		}
	}
}







