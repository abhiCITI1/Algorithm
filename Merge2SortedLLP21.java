
public class Merge2SortedLLP21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
