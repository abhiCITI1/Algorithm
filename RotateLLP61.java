
public class RotateLLP61 {
public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||head.next==null)
        {
            return head;
        }
        
        int len = 0;
        ListNode curr = head;
        while(curr!=null)
        {
            len++;
            curr = curr.next;
        }
        if(k>len)
        {
            k=k%len;
           // return head;
        }
        ListNode rotateStart=head,rotateEnd = head;
        while(k-->0)
        {
            rotateEnd = rotateEnd.next;
            if(rotateEnd==null)
                rotateEnd = head;
           // k--;
        }
        
        if(rotateStart==rotateEnd)
            return head;
        
        while(rotateEnd.next!=null)
        {
            rotateStart = rotateStart.next;
            rotateEnd = rotateEnd.next;
        }
        ListNode temp = rotateStart.next;
        rotateEnd.next = head;
        rotateStart.next = null;
        return temp;
       
    }

}
