import java.util.HashMap;
import java.util.HashSet;

public class JudgeSquareSumP633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JudgeSquareSumP633 p = new JudgeSquareSumP633();
		
		System.out.println(p.judgeSquareSum(7));
		
	}

	public boolean judgeSquareSum(int c) {
		
		HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i <= Math.sqrt(c); i++) {
            set.add(i * i);
            if (set.contains(c - i * i)) {
                return true;
            }
        }
        return false;
		
	}
}
