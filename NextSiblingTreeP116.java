import java.util.LinkedList;
import java.util.Queue;

public class NextSiblingTreeP116 {

	 public void connect(TreeLinkNode root) {
	        
	        TreeLinkNode temp = null;
	        if(root==null)
	            return ;
	        
	        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
	        q.offer(root);
	        q.offer(null);
	        
	        while(!q.isEmpty())
	        {
	        	temp = q.poll();
	        	if(temp!=null)
	        	{
	        		temp.next = q.peek();
	        		if(temp.left!=null)
	        			q.offer(temp.left);
	        		if(temp.right!=null)
	        			q.offer(temp.right);
	        	}
	        	else
	        	{
	        		if(!q.isEmpty())
	        			q.offer(null);
	        	}
	        }
	        
	        
	    }
}
