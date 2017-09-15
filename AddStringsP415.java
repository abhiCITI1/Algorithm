import java.util.LinkedList;
import java.util.List;

public class AddStringsP415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddStringsP415 p = new AddStringsP415();
		String n1 = "123";
		String n2 = "988";
		p.addStrings(n1, n2);
	}
	
	
	public String addStrings(String num1, String num2) {
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		
		for(int i=num1.length()-1,j=num2.length()-1;i>=0 || j>=0 || carry==1;i--,j--)
		{
			int x = i<0?0:num1.charAt(i)-'0';
			int y = j<0?0:num2.charAt(j)-'0';
			sb.append(x+y+carry%10);
			carry = x+y+carry/10;
		}
		
		return sb.reverse().toString();
		
        
    }

}
