import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,2,3,1};
		int[] a2 = {2,2,3,1};
		ArrayIntersection2 p =new ArrayIntersection2();
		System.out.println(p.intersect(a1, a2));
	}
	
	
	public int[] intersect(int[] nums1, int[] nums2)
	{
		//int[] arr1= new int[num1.length];
		//int[] arr2 = new int[a2.length];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) 
            	map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int[] res = new int[result.size()];
        
        for(int i=0; i<result.size();i++)
        {
        	res[i] = result.get(i);
        }
        
        
		
		return res;
		
	}

}
