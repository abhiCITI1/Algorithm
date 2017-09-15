import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RomantoIntegerP13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomantoIntegerP13 p13 = new RomantoIntegerP13();
		p13.romanToInt("MDCCCLXXXIV");//MCMXCVI - 1996
	}
	
	public int romanToInt(String s) {

		ArrayList<String> al = new ArrayList<String>();
		StringBuffer sb = new StringBuffer(s);
		int value = 0;
        
		if(sb.toString().contains("CM"))
		{
			
			sb = sb.delete(sb.indexOf("CM"), sb.indexOf("CM")+2);
			al.add("CM");
		}
		if(sb.toString().contains("CD"))
		{
			sb = sb.delete(sb.indexOf("CD"), sb.lastIndexOf("CD")+2);
			al.add("CD");
		}
		if(sb.toString().contains("XC"))
		{
			sb = sb.delete(sb.indexOf("XC"), sb.lastIndexOf("XC")+2);
			al.add("XC");
		}
		if(sb.toString().contains("XL"))
		{
			sb = sb.delete(sb.indexOf("XL"), sb.lastIndexOf("XL")+2);
			al.add("XL");
		}
		if(sb.toString().contains("IV"))
		{
			sb = sb.delete(sb.indexOf("IV"), sb.lastIndexOf("IV")+2);
			al.add("IV");
		}
		if(sb.toString().contains("IX"))
		{
			sb = sb.delete(sb.indexOf("IX"), sb.lastIndexOf("IX")+2);
			al.add("IX");
		}
        
		int i=0;
		while(i<sb.toString().length())
		{
			switch(sb.charAt(i))
			{
			case 'I':
				value+=1;
				break;
			case 'V':
				value+=5;
				break;
			case 'X':
				value+=10;
				break;
			case 'C':
				value+=100;
				break;
			case 'L':
				value+=50;
				break;
			case 'D':
				value+=500;
				break;
			case 'M':
				value+=1000;
				break;
			}
			
			i++;
			
		}
		
		for(String str : al)
		{
			switch(str)
			{
			case "IV":
				value+=4;
				break;
			case "IX":
				value+=9;
				break;
			case "CM":
				value+=900;
				break;
			case "XC":
				value+=90;
				break;
			case "XL":
				value+=40;
				break;
			case "CD":
				value+=400;
				break;
			}
		}
        
        
        return value;
    }

}
