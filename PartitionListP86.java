
public class PartitionListP86 {
	
	public ListNode partition(ListNode head, int x) {

		ListNode root = new ListNode(0);
		ListNode pivot = new ListNode(x);
		
		ListNode rootNext = root;
		ListNode pivotNext = pivot;
		ListNode currentNode = head;
		
		while(currentNode!=null)
		{
			if(currentNode.val>=x)
			{
				pivotNext.next = currentNode;
				pivotNext = currentNode;
				pivotNext.next = null;
			}
			else
			{
				rootNext.next = currentNode;
				rootNext = currentNode;
			}
			currentNode = currentNode.next;
		}
		
		rootNext.next = pivot.next;
		
		
		return root.next;

	}
}
