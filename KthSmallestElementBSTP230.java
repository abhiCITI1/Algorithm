
public class KthSmallestElementBSTP230 {
	public int kthSmallest(TreeNode root, int k) {

		int leftSubTreeCount = numOfNodes(root.left)+1;

		if(k==leftSubTreeCount)
			return root.val;
		else if(k<leftSubTreeCount)
			return kthSmallest(root.left,k);
		else
			return kthSmallest(root.right,k-leftSubTreeCount);

	}
	public int numOfNodes(TreeNode currentNode)
	{
		if(currentNode==null)
		{
			return 0;
		}
		else
		{
			return 1 + numOfNodes(currentNode.left) + numOfNodes(currentNode.right);
		}
	}
}
