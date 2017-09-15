
public class TreeToStrP606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeToStrP606 p =new TreeToStrP606();
		
		StringBuffer sb = new StringBuffer(); 
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = null;
        root.right.right = null;
        root.right.left = null;
        
        p.tree2str(root);
	}
	
	public String tree2str(TreeNode t)
	{
		if(t==null)
			return "";
		
		return tree2str1(t).toString(); 
	}
	
	
	 public StringBuilder tree2str1(TreeNode t) {
		 
		 if(t == null) return null;

	        StringBuilder sb = new StringBuilder();
	        sb.append(t.val);

	        StringBuilder left = tree2str1(t.left);
	        StringBuilder right = tree2str1(t.right);

	        if(right == null && left == null) return sb;
	        sb.append("(").append(left == null ? "" : left).append(")");
	        if(right != null) sb.append("(").append(right).append(")");
	        return sb;
	 }

}
