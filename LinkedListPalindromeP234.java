import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedListPalindromeP234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = null;
		
		LinkedListPalindromeP234 p = new LinkedListPalindromeP234();
		System.out.println(p.isPalindrome(head));
	}

	public boolean isPalindrome(ListNode head) {

		ListNode curr=head;
		ListNode prev = null;
		
		//Stack<Integer> stk = new Stack<Integer>();
		//Stack<Integer> auxStk = new Stack<Integer>();
		
		//Using queue instead of using 2 stacks
		Queue<Integer> q = new LinkedList<Integer>();
		
		boolean isPalindrome = false;
		
		
		if(head==null)
		{
			return true;
		}
		
		while(curr!=null)
		{
			//stk.push(curr.val);
			
			q.offer(curr.val);
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			
		}
		ListNode temp = prev;
		/* Using 2 stacks
		while(!stk.isEmpty())
		{
			auxStk.push(stk.pop());
		}
		
		while(temp!=null)
		{
			if(!auxStk.isEmpty())
			{
				if(temp.val==auxStk.pop())
				{
					isPalindrome = true;
				}
				else
				{
					isPalindrome = false;
					break;
				}
			}
			
			
			temp=temp.next;
		}*/
		
		while(temp!=null)
		{
			if(!q.isEmpty())
			{
				if(temp.val==q.poll())
				{
					isPalindrome = true;
				}
				else
				{
					isPalindrome = false;
					break;
				}
			}
		}
		
		
		
		return isPalindrome;
	}

}
