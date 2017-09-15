
public class DetectCapitalP520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean detectCapitalUse(String word) {
		
		
		return word.equals(word.toUpperCase()) || 
				word.equals(word.toLowerCase()) ||
				Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()); 

	}
}
