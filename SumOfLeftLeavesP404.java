import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 
 *  3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeavesP404 {
	
	public int sumOfLeftLeaves(TreeNode root) {


		if(root==null)
			return 0;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Stack<Integer> stk = new Stack<Integer>();

		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
			if(temp!=null)
			{
				if(temp.left!=null)
				{
					q.offer(temp.left);
					if(temp.left.left==null && temp.left.right==null)
						stk.push(temp.left.val);
				}
				if(temp.right!=null)
				{
					q.offer(temp.right);
				}

			}
			else
			{
				if(!q.isEmpty())
				{
					q.offer(null);
				}
			}
		}
		int sum = 0;

		while(!stk.isEmpty())
		{
			sum+=stk.pop();
		}




		return sum;

	}

}
