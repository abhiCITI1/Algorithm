import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 * 
 * 
 */
public class ArrayIntersection {
	
	
	public static void main(String[] args) {
		ArrayIntersection p = new ArrayIntersection();
		int[] nums1 = {1, 2, 2, 1}; 
		int[] nums2 = {2, 2};
		p.intersection(nums1, nums2);
	}
	
public int[] intersection(int[] nums1, int[] nums2) {
	
		
		int[] intersection = new int[nums2.length];
		
		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					intersection[j]=nums2[j];
				}
			}
		}
	
		
		return intersection;
        
    }

}
