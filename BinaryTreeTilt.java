
public class BinaryTreeTilt {
	int tilt = 0; 
    
    public int findTilt(TreeNode root) {
        
        postOrder(root);
        return tilt;
        
    }
    
    public int postOrder(TreeNode root)
    {
         
        if(root==null)
            return 0;
        
        int leftSum  = postOrder(root.left);
        int rightSum = postOrder(root.right);
        
        tilt += Math.abs(leftSum-rightSum);
        
        return leftSum + rightSum + root.val;
        
    }
}