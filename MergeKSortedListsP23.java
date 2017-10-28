import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedListsP23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public ListNode mergeKLists(ListNode[] lists) {
	        
	        if(lists==null || lists.length==0)
	        	return null;
	        
	        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
	        	
	        	public int compare(ListNode l1 , ListNode l2)
	        	{
	        		return l1.val>l2.val ? 1 : (l1.val<l2.val ? -1 : 0);
	        	}
	        	
			});
	        
	        
	        for(ListNode node : lists)
	        {
	        	queue.add(node);
	        }
	        
	        ListNode head = null, curr = null;
	        while(!queue.isEmpty())
	        {
	        	if(head==null)
	        	{
	        		head = queue.poll();
	        		curr= head;
	        	}
	        	else
	        	{
	        		curr.next = queue.poll();
	        		curr = curr.next;
	        	}
	        	if(curr.next!=null)
	        	{
	        		queue.add(curr.next);
	        	}
	        }
	        
	        
	        return head;
	        
	 }

}
