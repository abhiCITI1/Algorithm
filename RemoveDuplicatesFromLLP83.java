import java.util.HashMap;

public class RemoveDuplicatesFromLLP83 {
	
	public ListNode deleteDuplicates(ListNode head) {
		
	ListNode curr = head;
    ListNode prev, nextNode;
	
	HashMap<Integer, Boolean> hm = new HashMap<Integer,Boolean>();
    
    if(head==null)
    {
        return null;
    }
	
	while(curr.next!=null)
	{
		nextNode = curr.next;
        
		prev = curr;
        
		if(hm.get(curr.val)!=null)
        {
            prev.next = curr.next;
            if(hm.get(curr.next.val)!=null)
            {
            	prev.next = curr.next.next==null?null:curr.next.next ;
            }
        }
        else
        {
            hm.put(curr.val, true);
        }
		
		curr = curr.next;
	}
	
	
	return head;
    

    }

}
