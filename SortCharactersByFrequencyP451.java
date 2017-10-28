import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class SortCharactersByFrequencyP451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortCharactersByFrequencyP451 p = new SortCharactersByFrequencyP451();
		p.frequencySort("cccaaa");
	}
	
	@SuppressWarnings("unchecked")
	public String frequencySort(String s) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> list = new LinkedList<>(hm.entrySet());
		
		Collections.sort(list, new Comparator(){
			
			public int compare(Object o1, Object o2){
				return ((Comparable)((Map.Entry) (o2)).getValue()).
						compareTo(((Map.Entry) (o1)).getValue());
				
			}
		});
		
		char[] cArr = new char[s.length()];
		
		Iterator<Map.Entry<Character, Integer>> itr = list.iterator();
		
		int i=0;
		for(Map.Entry<Character, Integer> entry : list)
		{
			
			int entryVal = entry.getValue();
			char entryKey = entry.getKey();
			
			if(entryVal>1)
			{
				for(int k=0;k<entryVal;k++)
				{
					cArr[i] = entryKey;
					i++;
				}
			}
			else
			{
				cArr[i] = entryKey;
				i++;
			}
				
		}
		
		return String.valueOf(cArr);
    }

}
