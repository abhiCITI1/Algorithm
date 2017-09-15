import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1)
 */
public class LeastIndexSum2LLP599 {
	
	public static void main(String[] args) {
		LeastIndexSum2LLP599 p =new LeastIndexSum2LLP599();
		
		String[] l1 = {"Shogun", "KFC", "Burger King", "Tapioca Express"};
		String[] l2 = {"KFC", "Shogun", "Burger King"};
		
		
		p.findRestaurant(l1, l2);
		
	}
	
	 public String[] findRestaurant(String[] list1, String[] list2) {
		 
		 HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		 
		 for(int i=0;i<list1.length;i++)
		 {
			 hm1.put(list1[i], i);
		 }
		 
		 int indexSum = 0, minSum = Integer.MAX_VALUE;
		 String minIndexRest  = "";
		 HashMap<Integer, List<String>> minHM = new HashMap<Integer, List<String>>();
		 List<String> li = new ArrayList<String>();
		 
		 for(int j=0;j<list2.length;j++)
		 {
			 if(hm1.containsKey(list2[j]))
			 {
				 indexSum = j + hm1.get(list2[j]);
			 }
			
			 if(indexSum<=minSum)
			 {
				 minSum = indexSum;
				 minIndexRest = list2[j];
				 li.add(minIndexRest);
				 
				 if(indexSum==minSum)
				 {
					 if(!minHM.isEmpty())
					 {
						 List<String> l = minHM.get(minSum);
						 l.add(minIndexRest);
						 minHM.put(minSum,l);
					 }
					 
					 
				 }
				 else
				 {
					 minHM.put(minSum, li);
				 }
				 
			 }
		 }
		
		 
		 int min = Integer.MAX_VALUE;
		 
		 
		 for(int key : minHM.keySet())
		 {
			 min = Math.min(min, key);
		 }
		 
		 String[] res = new String[minHM.get(min).size()];
		 
		 return minHM.get(min).toArray(res);
	        
	    }
}
