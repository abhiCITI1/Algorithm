import java.util.List;

/*
 * * Let us create a unsorted linked lists to test the functions Created
         * lists shall be a: 2->3->20->5->10->15
         */
public class SOrtListP148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next.next = new ListNode(8);
		head.next.next.next.next.next.next.next = new ListNode(9);
		SOrtListP148 p =new SOrtListP148();
		p.sortList(head);
		
		
		
		
	}
	
	public ListNode sortList(ListNode head) {
		
		
		if(head==null || head.next==null)
			return head;
		//finding the middle of the list
		ListNode middle = getMiddle(head);
		
		
		//divide the list as (start, middle) & (middle.next, end) and sort both the lists recursively
		
		ListNode l2 = middle.next;
		middle.next = null;
		
		ListNode l1 = head;
		ListNode head1 = sortList(l1);
		ListNode head2 = sortList(l2);
		//merge two sorted lists into one sorted list
		ListNode finalSortList = null;
		
		try {
			finalSortList = mergeTwoLists(head1, head2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured");
		}
		
		
		return finalSortList;
    }
	
	public ListNode getMiddle(ListNode head)
	{
		if(head==null)
			return head;
		
		ListNode fastptr = head.next;
		ListNode slowptr = head;
		
		while(fastptr!=null)
		{
			fastptr = fastptr.next;
			if(fastptr!=null)
			{
				slowptr = slowptr.next;
				fastptr = fastptr.next;
			}
			
		}
		return slowptr;
	}
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		
		//[1,3,5]
		//[2,4,6] -op [1,3,5,2,4,6]
		ListNode finalList;
		
		if(l1!=null && l2!=null)
		{
			if(l1.val<l2.val)
			{
				finalList = l1;
				finalList.next = mergeTwoLists(l1.next, l2);
			}
			else
			{
				finalList = l2;
				finalList.next = mergeTwoLists(l2.next, l1);
			}
		}
		else if(l1==null && l2!=null)
		{
			return l2;
		}
		else if(l1!=null && l2==null)
		{
			return l1;
		}
		else
		{
			return null;
		}
		
		
        return finalList;
    }
	

}
