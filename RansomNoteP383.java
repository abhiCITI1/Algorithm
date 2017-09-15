import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RansomNoteP383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNoteP383 p = new RansomNoteP383();
		p.canConstruct("fihjjjjei",
				"hjibagacbhadfaefdjaeaebgi");
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c : magazine.toCharArray())
		{
			int newCount = hm.getOrDefault(c, 0)+1;
			hm.put(c, newCount);
		}
		
		for(char c:ransomNote.toCharArray())
		{
			int newCount = hm.getOrDefault(c, 0) -1;
			if(newCount<0)
				return false;
			hm.put(c, newCount);
		}

		return true;
	}

}
