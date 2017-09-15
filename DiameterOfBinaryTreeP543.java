
public class DiameterOfBinaryTreeP543 {
	

    
    public int diameterOfBinaryTree(TreeNode root) {
        
        int left, right;
        if(root==null)
            return 0;
        
        //if passes through root longest path = left subtree height+right subtree height
        int len1 = height(root.left)+height(root.right);
        
        //doesnt pass through root
        int len2 = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        
        return Math.max(len1,len2);
        
        
        
        
    }
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return (leftHeight>rightHeight)?leftHeight+1:rightHeight+1;
        
    }
    

}
