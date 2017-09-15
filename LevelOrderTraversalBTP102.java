import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LevelOrderTraversalBTP102 {
	
	@SuppressWarnings("unused")
	public List<List<Integer>> levelOrder(TreeNode root) {
	      
		 List<List<Integer>> alFinal = new ArrayList<List<Integer>>();
		 List<Integer> curr = new ArrayList<Integer>();
		 
		 Queue<TreeNode> q = new LinkedList<TreeNode>();
		 q.offer(root);
		 q.offer(null);
		 while(!q.isEmpty())
		 {
			 TreeNode temp = q.poll();
			 curr.add(temp.val);
			 if(temp!=null)
			 {
				 if(temp.left!=null)
					 q.offer(temp.left);
				 if(temp.right!=null)
					 q.offer(temp.right);
			 }
			 else
			 {
				 List<Integer> list_Curr = new ArrayList<Integer>(curr);
				 
				 alFinal.add(list_Curr);
				 curr.clear();
				 if(!q.isEmpty())
				 {
					 q.offer(null);
				 }
				 
			 }
		 }
		 Map<String,String> hm = new HashMap<String,String>();
		 
		 
		 
		  return alFinal;
	    }

}
