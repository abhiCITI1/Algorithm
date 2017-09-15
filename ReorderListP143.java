
public class ReorderListP143 {
	public void reorderList(ListNode head) {

		if(head==null)
			return;

		ListNode slowPtr = head, fastPtr = head.next;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		ListNode head1 = head;
		ListNode head2 = slowPtr.next;
		slowPtr.next=null;

		head2 = reverse(head2);

		ListNode finalNode = new ListNode(0);
		ListNode curr = finalNode;

		while(head1!=null || head2!=null)
		{
			if(head1!=null)
			{
				curr.next = head1;
				curr= curr.next;
				head1=head1.next;
			}
			if(head2!=null)
			{
				curr.next = head2;
				curr= curr.next;
				head2=head2.next;
			}
		}
		finalNode = finalNode.next;

	}

	public ListNode reverse(ListNode head)
	{
		ListNode prev=null;
		ListNode curr = head;
		while(curr!=null)
		{
			ListNode next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

}
