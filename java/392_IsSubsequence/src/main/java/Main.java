
public class Main {

	public static void main(String[] args) {
		String s = "asd";
		String t = "ssssaaqwddd";

		int i = 0; // S �r��b T �̭����ƶq
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		
		if (i == s.length()) {
			// return true;
		}

		// return false;

	}

}
