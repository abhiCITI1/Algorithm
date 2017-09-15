import java.util.Stack;

public class TreePathSumP112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		boolean isPathSum = false;

		//Take a stack to track subtree of each root visited
		Stack<TreeNode> s = new Stack<TreeNode>();

		s.push(root);
		int sum1 = 0;

		while(!s.isEmpty())
		{

			TreeNode temp = s.pop();
			sum1 +=temp.val;
			
			if(temp!=null)
			{
				if(temp.right!=null)
				{
					s.push(temp.right);
				}
				if(temp.left!=null)
				{
					s.push(temp.left);
				}
			}
			
			if(sum1==sum)
			{
				isPathSum = true;
				break;
			}

		}

		return isPathSum;
	}
}
