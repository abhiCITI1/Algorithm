import java.util.HashMap;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		
		ListNode fastPtr=head,slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr==slowPtr)
				return true;
		}
		return false;
	}

}
