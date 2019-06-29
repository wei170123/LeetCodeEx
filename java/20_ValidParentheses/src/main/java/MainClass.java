import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MainClass {
	
	private static Map<Character, Character> dataMap;
	
	static {
        Map<Character, Character> intMap = new HashMap<Character, Character>();
        intMap.put(')', '(');
        intMap.put(']', '['); 
        intMap.put('}', '{');
        dataMap = Collections.unmodifiableMap(intMap);
    }

	// (([]){})
	// {)
	// ()[]{}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入");

		String str = scanner.nextLine();

		System.out.println("輸入為:" + str);

		scanner.close();
		
		Stack<Character> st = new Stack<Character>();
		
		int size = str.length();
		
		if(size % 2 > 0) {
			System.out.println("結果為++:" + false);
//			return false;
		}
		
		int i = 0;
		while(i < size) {
			if(dataMap.get(str.charAt(i)) == null) {
				st.add(str.charAt(i));
				i++;
			}
			else if(st.isEmpty()) {
				System.out.println("結果為:" + false);
//				return false;
			}
			else {
				char tmp = st.pop();
				if(dataMap.get(str.charAt(i)) != tmp) {
					System.out.println("結果為:" + false);
//					return false;
				}
				else if(dataMap.get(str.charAt(i)) == tmp) {
					i++;
				}
				else {
					i = i + 2;
				}
			}
			
			
		}
		
//		return st.isEmpty();
		if(st.isEmpty()) {
			System.out.println("結果為:" + true);
		}
		else {
			System.out.println("結果為:" + false);
		}
		
		
	}

}
