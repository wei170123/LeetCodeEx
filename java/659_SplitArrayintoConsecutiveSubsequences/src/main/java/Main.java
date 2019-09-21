import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,4,5};
		// 1,2,3,3,4,4,5,5
		
		Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> need = new HashMap<>();
        // 参璸计瞷Ω计
        for (int i : nums) {
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);
        }
        
        for (int i : nums) {
            if (cnt.get(i) == 0) {
                continue;
            } 
            else if (need.getOrDefault(i, 0) > 0) {
                need.put(i, need.get(i) - 1);
                need.put(i + 1, need.getOrDefault(i + 1, 0) + 1);
            } 
            // 硈尿计 衡皚
            else if (cnt.getOrDefault(i + 1, 0) > 0 && cnt.getOrDefault(i + 2, 0) > 0) {
                cnt.put(i + 1, cnt.get(i + 1) - 1);
                cnt.put(i + 2, cnt.get(i + 2) - 1);
                // ﹚Ω皚秨﹍翴
                need.put(i + 3, need.getOrDefault(i + 3, 0) + 1);
            } 
            else {
//                return false;
            }
            cnt.put(i, cnt.get(i) - 1);
        }
//        return true;

	}

}
