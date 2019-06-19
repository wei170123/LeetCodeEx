/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _RoamToInteger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RoamConvertUtil {
	
	private static Map<String, Integer> romanMap;
	
	static {
        Map<String, Integer> intMap = new HashMap<String, Integer>();
        intMap.put("I", 1);
        intMap.put("V", 5);
        intMap.put("X", 10);
        intMap.put("L", 50);
        intMap.put("C", 100);
        intMap.put("D", 500);
        intMap.put("M", 1000);
        romanMap = Collections.unmodifiableMap(intMap);
    }
	
    /**
     * 根據羅馬數字規則，一次取兩位處理
     * 
     * MCMXCIV 1994
     * MCDLXXVI 1476
     * 
     * @param roamStr 羅馬數字
     * @return 阿拉伯數字
     * @throws Exception 非標準羅馬數字
     */
    public static int convert(String romanStr) throws Exception {
    	int result = 0;
    	
    	char[] romanChar = romanStr.toUpperCase().toCharArray();
    	int size = romanChar.length;
    	
		for (int i = 0; i < size; i++) {
			Integer i1 = romanMap.get(String.valueOf(romanChar[i]));
			
			if (i != size - 1) {
				Integer i2 = romanMap.get(String.valueOf(romanChar[i + 1]));
				if (i1 >= i2) {
					result += i1;
				} else {
					result += i2 - i1;
					i++;
				}
			} else {
				result += i1;
			}

		}
    	
        return result;
    }
}
