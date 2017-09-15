
public class NthNodeFromEndLLP19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        
		//Iterate on the LL and find its length [1,2] , 1
		int length = 0;
		
		ListNode temp1 = head;
		while(temp1!=null)
		{
			temp1 = temp1.next;
			length++;
		}
		
		if(length==1)
		{
			return null;
		}
		
		//Go till length-n+1 node and remove it
		ListNode temp = head;
		
		for(int i=1;i<length-n+1;i++)
		{
			if(i==length-n)
			{
				temp.next = temp.next.next;
			}
			else
			{
				temp = temp.next;
			}
		}
		if(length-n==0)
		{
				head = head.next;
				temp.next = null;
		}
		
		return head;
    }

}
