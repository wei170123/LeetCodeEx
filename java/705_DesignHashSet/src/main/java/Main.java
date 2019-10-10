import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static class MyHashSet {
		
		List<Integer> result;

	    /** Initialize your data structure here. */
	    public MyHashSet() {
	    	result = new ArrayList<Integer>();
	    }
	    
	    public void add(int key) {
	    	result.add(key);
	    }
	    
	    public void remove(int key) {
	    	result.removeIf(s -> s.equals(key));
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	    	return result.contains(key);
	    }
	}
}
