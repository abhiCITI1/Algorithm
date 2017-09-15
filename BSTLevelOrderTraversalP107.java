import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BSTLevelOrderTraversalP107 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        
			if(root==null)
				return new ArrayList<List<Integer>>();
			
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			Stack<TreeNode> stk = new Stack<TreeNode>();
			
			q.offer(root);
			q.offer(null);
			
			while(!q.isEmpty())
			{
				TreeNode temp = q.poll();
				if(temp!=null)
				{
					if(temp.right!=null)
						q.offer(temp.right);
					if(temp.left!=null)
						q.offer(temp.left);
				}
				else
				{
					if(!q.isEmpty())
						q.offer(null);
				}
				if(!q.isEmpty())
					stk.push(temp);
			}
			
			List<List<Integer>> l = new ArrayList<List<Integer>>();
			List<Integer> al = new ArrayList<Integer>();
			while(!stk.isEmpty())
			{
				
				TreeNode temp = stk.pop();
				if(temp!=null)
				{
					al.add(temp.val);
				}
				else
				{
					ArrayList<Integer> tempList = new ArrayList<Integer>(al);
					l.add(tempList);
					al.clear();
				}
				
				if(stk.isEmpty())
				{
					l.add(al);
				}
			}
			
			return l;
	    }
}
