
public class BTfromInAndPostOrderP106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {

		if(inorder.length==0||postorder.length!=inorder.length)
		{
			return null;
		}
		return buildBT(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
	}

	public TreeNode buildBT(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd)
	{
		if(postStart>postEnd||inStart>inEnd)
			return null;

		int data = postorder[postEnd];
		TreeNode curr = new TreeNode(data);

		int offset = inStart;
		for(;offset<inorder.length;offset++)
		{
			if(inorder[offset]==data)
				break;
		}

		curr.left = buildBT(postorder, postStart, postStart+offset-inStart-1,inorder,inStart,offset-1);
		curr.right = buildBT(postorder,postStart+offset-inStart,postEnd-1,inorder,offset+1,inEnd);

		return curr;
	}
}
