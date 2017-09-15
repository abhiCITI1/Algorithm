
public class BTfromInAndPreOrderP105 {
	
public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(preorder.length==0 || preorder.length!=inorder.length)
            return null;
        
        return buildBT(preorder, 0 , preorder.length-1, inorder, 0, inorder.length-1);
        
    }
    
    public TreeNode buildBT(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd)
    {
        if(preStart>preEnd || inStart>inEnd)
            return null;
        
        if(preorder.length==1 && inorder.length==1)
            return new TreeNode(preorder[preStart]);
       
        int rootData = preorder[preStart];
        TreeNode curr = new TreeNode(rootData);
        
        int offset = inStart;
        
        for(;offset<inorder.length;offset++)
        {
            if(inorder[offset]==rootData)
            {
                break;
            }
        }
        
        curr.left = buildBT(preorder, preStart+1, preStart+offset-inStart, inorder, inStart, offset-1);
        curr.right = buildBT(preorder, offset+preStart-inStart+1, preEnd, inorder, offset+1, inEnd);
        
        return curr;
        
    }
    

}
