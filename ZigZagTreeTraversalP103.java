import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTreeTraversalP103 {
	
	
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	
		if(root==null)
		{
			return new ArrayList<List<Integer>>();
		}
	
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		boolean leftToRight = true;
		
		q.offer(root);
		q.offer(null);
		
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
			if(temp!=null)
			{
				curr.add(temp.val);
				if(temp.left!=null)
				{
					q.offer(temp.left);
				}
				if(temp.right!=null)
				{
					q.offer(temp.right);
				}
			}
			else
			{
				if(leftToRight)
				{
					ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
					res.add(c_curr);
					curr.clear();
				}
				else
				{
					Stack<Integer> stk = new Stack<Integer>();
					ArrayList<Integer> c_curr = new ArrayList<Integer>();
					curr.clear();
					stk.addAll(curr);
					while(!stk.isEmpty())
					{
						c_curr.add(stk.pop());
					}
					res.add(c_curr);
				}
				if(!q.isEmpty())
				{
					q.offer(null);
					leftToRight = !leftToRight;
				}
			}
		}
		
		
		
	
		return res;
        
    }
	

}
