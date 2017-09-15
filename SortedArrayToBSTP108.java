
public class SortedArrayToBSTP108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		
		int left = 0;
		int right = nums.length-1;
		
		
		TreeNode node = buildBST(nums,left, right);
		
		
		return node;
		
		
	}
	
	public TreeNode buildBST(int[] nums, int left, int right)
	{
		TreeNode node = new TreeNode(0);
		
		if(left>right)
			return null;
		
		if(left==right)
		{
			node.val = nums[left];
			node.left = null;
			node.right = null;
		}
		else
		{
			int mid = left + (right-left)/2;
			node.val = nums[mid];
			node.left = buildBST(nums,left, mid-1);
			node.right = buildBST(nums,mid+1,right);
		}
		
		
		return node;
		
	}
	
	
}
