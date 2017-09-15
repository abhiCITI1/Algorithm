import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 * 
 */
public class BinaryTreePathsP257 {
	
	
	public static void main(String[] args) {
		BinaryTreePathsP257 p =new BinaryTreePathsP257();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		TreeNode rl = root.left;
		TreeNode rr = root.right;
		
		rl.left = new TreeNode(5);
		rl.right = null;
		rr.left=rr.right = null;
		p.binaryTreePaths(root);
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<String>();
        
        //int[] paths = new int[256];
        
        l = printPath(root,"", l);
        return l;
        
    }
    public List<String> printPath(TreeNode root, String path, List<String> l)
    {
    	//List<String> li = new ArrayList<String>();
    	
        if(root==null)
            return null;
        
       
        //this is a leaf node
        if(root.left==null && root.right==null)
        {
        	l.add(path+root.val);
        }
        if(root.left!=null)
        {
        	printPath(root.left,path+root.val+"->",l);
        }
        if(root.right!=null)
        	printPath(root.right,path+root.val+"->",l);
        
        
        return l;
      
    }
}
