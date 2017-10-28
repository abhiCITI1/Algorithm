import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentEleP347 {

public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
		
		List<Map.Entry> list = new LinkedList<Map.Entry>(hm.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        List<Integer> finalList = new ArrayList<>();

       for(int i=0;i<k;i++){
           finalList.add((Integer) list.get(i).getKey());
       }
        return finalList;
    }

}
