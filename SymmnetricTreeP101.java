
public class SymmnetricTreeP101 {
	public boolean isSymmetric(TreeNode root) {

		return root==null || isSymmetricHelper(root.left,root.right);

	}
    
    public boolean isSymmetricHelper(TreeNode root1, TreeNode root2)
    {
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        
        return isSymmetricHelper(root1.left,root2.right) && isSymmetricHelper(root1.right, root2.left);
        
    }
}
