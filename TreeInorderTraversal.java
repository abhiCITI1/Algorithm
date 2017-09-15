import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//inorder - LDR (Left,Root,Right)
public class TreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        boolean isProcessed = false;
        TreeNode currNode = root;
        
        while(!isProcessed)
        {
        	if(currNode!=null)
        	{
        		s.push(currNode);
        		currNode = currNode.left;
        	}
        	else
        	{
        		if(s.isEmpty())
        		{
        			isProcessed = true;
        		}
        		else
        		{
        			currNode = s.pop();
        			al.add(currNode.val);
        			currNode = currNode.right;
        		}
        	}
        }
        
        return al;
        
    }

}
