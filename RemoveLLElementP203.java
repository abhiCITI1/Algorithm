import java.util.HashMap;
import java.util.List;

public class RemoveLLElementP203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(0);
		ListNode temp = head;
		
		int i = 1;
		while(temp!=null)
		{
			i++;
			if(i==7)
			{
				temp = null;
				break;
			}
			if(i==2 || i==4)
			{
				temp.next = new ListNode(1);
			}
			else
			{
				temp.next = new ListNode(i);
			}
			temp= temp.next;
			
		}
		
		
		RemoveLLElementP203 removeLLElementP203 = new RemoveLLElementP203();
		System.out.println(removeLLElementP203.removeElements(head,1));
	}

	
public ListNode removeElements(ListNode head, int val) {
        
        ListNode tempNode = new ListNode(-1);
        
        tempNode.next= head;
        ListNode prev = tempNode;
        ListNode curr = head;   
        
        while(curr!=null)
        {
        	if(curr.val==val)
        	{
        		prev.next=curr.next;
        	}
        	else
        	{
        		prev = prev.next;
        	}
        	curr = curr.next;
        	
        }
        return tempNode.next;
        
    }
}
