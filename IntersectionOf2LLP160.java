import java.util.HashMap;

public class IntersectionOf2LLP160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();

		ListNode intersectingNode = null;

		if(headA==null || headB==null)
			return null;

		while(headA!=null)
		{
			hm.put(headA.val,true );
			headA = headA.next;
		}

		while(headB!=null)
		{
			if(hm.get(headB.val)!=null)
			{
				intersectingNode =  headB;
				break;
			}
			else
			{
				hm.put(headB.val, true);
			}
			headB = headB.next;
		}

		if(intersectingNode==null)
			return null;

		return intersectingNode;
	}

}
