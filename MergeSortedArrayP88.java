import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrayP88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,6};
		int[] b = {1,3,5};
		MergeSortedArrayP88 p =new MergeSortedArrayP88();
		p.merge(a, a.length+b.length, b, b.length);

		
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {


		int i = m - 1, j = n - 1, k = m + n - 1;
		while(i >= 0 && j >= 0) {
			nums1[k] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
			k--;
		}
		while(j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}

}
