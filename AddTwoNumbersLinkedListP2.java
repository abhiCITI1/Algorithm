
public class AddTwoNumbersLinkedListP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = new int[] {'2','4','3'};
		int[] a2 = new int[] {'4','6','5'};
		
		AddTwoNumbersLinkedListP2 p2 = new AddTwoNumbersLinkedListP2();
		
		

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0)
        {
            int l1Int,l2Int;
            
            
            l1Int = (l1==null)? 0 : l1.val;
            l2Int = (l2==null)? 0 : l2.val;
            
            ListNode curr = new ListNode(0);
            
            int sum = l1Int + l2Int + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            curr.val = sum;
            prev.next = curr;
            prev = curr;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
            
           // l1 = (l1.next==null)?l1:l1.next;
            
            //l2 = (l2.next==null)?l2:l2.next;
            
        }
        
        return head.next;
        
        
   }
	
	
	

}
