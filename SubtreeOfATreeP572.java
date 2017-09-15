
public class SubtreeOfATreeP572 {

	public boolean isSubtree(TreeNode s, TreeNode t) {

		String s1 = inorderTree1(s);
		String s2 = inorderTree1(t);
		
		if(s1.contains(s2)||s2.contains(s1))
			return true;
		else
			return false;
	}
	
	public String inorderTree1(TreeNode s)
	{
		StringBuffer str = new StringBuffer();
		
		if(s.left==null && s.right==null)
		{
			str.append(String.valueOf(s.val));
		}
		inorderTree1(s.left);
		str.append(String.valueOf(s.val));
		inorderTree1(s.right);
		
		return str.toString();
		
	}
	
	public String inorderTree2(TreeNode t)
	{
		StringBuffer str = new StringBuffer();
		
		if(t.left==null && t.right==null)
		{
			str.append(String.valueOf(t.val));
		}
		inorderTree1(t.left);
		str.append(String.valueOf(t.val));
		inorderTree1(t.right);
		
		return str.toString();
		
	}

}
