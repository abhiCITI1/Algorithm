import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//PreOrder - DLR(Root,Left,Right)
public class TreePreOrderTraversalP144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
        
		//list to store the properly traversed elements
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//Take a stack to track subtree of each root visited
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		s.push(root);
		
		while(!s.isEmpty())
		{
			
			TreeNode temp = s.pop();
			if(temp!=null)
			{
				al.add(temp.val);
				
				if(temp.right!=null)
				{
					s.push(temp.right);
				}
				if(temp.left!=null)
				{
					s.push(temp.left);
				}
			}
			
			
		}
       
        
        return al;
    }

}
