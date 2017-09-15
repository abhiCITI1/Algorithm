import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBTP637 {

	public List<Double> averageOfLevels(TreeNode root) {
		
		if(root==null)
			return new ArrayList<Double>();
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.offer(root);
		q.offer(null);
		
		
		int nodeCount = 0;
		double sum = 0.0;
		Double levelAvg = 0.0;
		List<Double> l = new ArrayList<Double>();
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
			if(temp!=null)
			{
				sum +=temp.val;
				nodeCount++;
				if(temp.right!=null)
					q.offer(temp.right);
				if(temp.left!=null)
					q.offer(temp.left);
			}
			else
			{
				levelAvg = (double) (sum/nodeCount);
				l.add(levelAvg);
				sum=nodeCount=0;
				if(!q.isEmpty())
					q.offer(null);
			}
			
		}
		
		
		return l;

	}

    
	

}
