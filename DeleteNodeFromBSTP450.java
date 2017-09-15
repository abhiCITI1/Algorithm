
public class DeleteNodeFromBSTP450 {
	
public TreeNode deleteNode(TreeNode root, int key) {
    
	TreeNode temp;
    
    if(root!=null && root.val==key)
    {
        if(root.left==null)
        {
            temp = root;
            root = root.right;
            temp = null;
        }
        else if(root.right==null)
        {
            temp = root;
            root = root.left;
            temp = null;
        }
    }
	
	if(root==null)
		System.out.println("No element to delete");
	else if(key<root.val)
		root.left = deleteNode(root.left, key);
	else if(key>root.val)
		root.right = deleteNode(root.right, key);
	else
	{
		//Element is found
		if(root.left!=null && root.right!=null)
		{
			//replace with largest element in the left subtree
			temp = findMax(root.left);
			root.val = temp.val;
			root.left = deleteNode(root.left, root.val);
		}
        else if(root.left==null && root.right==null)
        {
            return null;
        }
		else
		{
			temp = root;
            if(root!=null)
            {
                if(root.left==null)
                {
                    root = root.right;
                    //temp = null;
                }
                if(root.right==null)
                {
                    root = root.left;
                    //temp = null;
                }
            }
			
		}
	}
	return root;
	}

	public TreeNode findMax(TreeNode root)
	{
		if(root==null)
			return null;
		else
		{
			if(root.right==null)
				return root;
				
			else
				return findMax(root.right);
		}
		
	}
	
}
