/*
 * Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
 * 
 * 
 */
public class MergerTwoBTP617 {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		if(t1==null && t2==null)
		{
			return null;
		}
		
		if(t1==null)
			return t2;
		if(t2==null)
			return t1;
		
		//t1.val = t1.val+t2.val;
		
		TreeNode temp  = new TreeNode(t1.val+t2.val);
		
		if(t1.left!=null || t2.left!=null)
		{
			temp.left = mergeTrees(t1.left, t2.left);
		}
		if(t1.right!=null || t2.right!=null)
		{
			temp.right = mergeTrees(t1.right, t2.right);
		}
		
		return temp;

	}
}
