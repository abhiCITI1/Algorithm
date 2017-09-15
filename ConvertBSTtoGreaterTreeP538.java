
public class ConvertBSTtoGreaterTreeP538 {

	int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.right =  new TreeNode(13);
		root.left = new TreeNode(2);
		
		ConvertBSTtoGreaterTreeP538 p = new ConvertBSTtoGreaterTreeP538();
		p.convertBST(root);

	}
	
	
public TreeNode convertBST(TreeNode root) {
        
		greaterBST(root);
		
		return root;
	
    }

public void greaterBST(TreeNode root)
{
	if(root==null)
		return;
	
	greaterBST(root.right);
	
	root.val +=sum;
	
	sum = root.val;
	
	greaterBST(root.left);

	
	//return root;
}

}
