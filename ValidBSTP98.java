
public class ValidBSTP98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidBSTP98 p = new ValidBSTP98();
		
		TreeNode tree = new TreeNode(1);
		  
        
        tree.left = new TreeNode(1);
        p.isValidBST(tree);
        
	}
public boolean isValidBST(TreeNode root) {
        
    return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

public boolean isBST(TreeNode root, long min, long max)
{
    if(root==null)
    	return true;
   
    if(root.val<=min || root.val>=max )
    	return false;
	
    return (isBST(root.left,min, root.val) && isBST(root.right,root.val, max));
    
}
}
