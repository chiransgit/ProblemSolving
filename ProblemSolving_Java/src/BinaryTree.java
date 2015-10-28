
public class BinaryTree {

	TreeNode root;
	static int sum = 0;
	
	public static void main(String [] args){
		
		BinaryTree obj = new BinaryTree();
		obj.add(new TreeNode(4));
		obj.add(new TreeNode(3));
		obj.add(new TreeNode(5));
		obj.add(new TreeNode(6));
		obj.add(new TreeNode(8));
		//obj.inorder(obj.root);
		System.out.println(obj.sumExceptLeaf(obj.root));
	}
	
	public void add(TreeNode n){
		
		TreeNode temp = root;
		if(root == null){
			root = n;
		}
		else{
			TreeNode parent;
			while(true){
				parent = temp;
				if(n.val <= temp.val){
					temp = temp.left;
					if(temp == null){
						parent.left = n;
						return;
					}
				}
				else{
					temp = temp.right;
					if(temp == null){
						parent.right = n;
						return;
					}
				}
			}
		}
	}
	
	public void inorder(TreeNode root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.val + "  ");
		inorder(root.right);
	}
	
	public int sumExceptLeaf(TreeNode root){
		if(root == null){
			return 0;
		}
		sumExceptLeaf(root.left);
		if(root.left != null || root.right != null){
			sum += root.val;
		}
		sumExceptLeaf(root.right);
		return sum;
	}
	
	
}
