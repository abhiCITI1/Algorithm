
public class LCABSTP235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root==null)
			return root;
		if(root==p || root==q)
			return root;
		if((root.left==p || root.right==p) && (root.right==q || root.left==q))
			return root;
		if(p.val<root.val && q.val<root.val)
			return lowestCommonAncestor(root.left,p,q);
		else if(p.val>root.val && q.val>root.val)
			return lowestCommonAncestor(root.right,p,q);
		else return root;
	}

}
