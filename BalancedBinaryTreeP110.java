
public class BalancedBinaryTreeP110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TreeNode tree = new TreeNode(1);
		  
        
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.right.right = new TreeNode(3);
        tree.left.left.left = new TreeNode(4);
        tree.right.right.right = new TreeNode(4);
        
        
        BalancedBinaryTreeP110 p = new BalancedBinaryTreeP110();
        System.out.println(p.isBalanced(tree));
	}
	
	 public boolean isBalanced(TreeNode root) {
	        
		 if(root==null)
	            return true;
	        
	        return isBalanced(root.left) && isBalanced(root.right) && 
	            Math.abs(heightOfSubTree(root.left)-heightOfSubTree(root.right))<=1;
	        
	    }
	    
	    public int heightOfSubTree(TreeNode root)
	    {
	        int leftHeight=0,rightHeight=0;
	        if(root==null)
	            return 0;
	        
	        leftHeight = heightOfSubTree(root.left);
	        rightHeight = heightOfSubTree(root.right);
	        
	        return (leftHeight>rightHeight)?leftHeight+1:rightHeight+1;
	    }

}
