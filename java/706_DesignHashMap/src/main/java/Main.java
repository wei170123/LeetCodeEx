public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static class MyHashMap {

		class ListNode {
			int val;
			int key;
			ListNode next;

			ListNode(int key, int val) {
				this.key = key;
				this.val = val;
			}
		}

		private ListNode[] nodes;

		private int getIdx(int key) {
			return Integer.hashCode(key) % nodes.length;
		}

		ListNode find(ListNode node, int key) {
			ListNode n = node;
			ListNode pre = null;
			while (n != null && n.key != key) {
				pre = n;
				n = n.next;
			}
			return pre;

		}

		public MyHashMap() {
			nodes = new ListNode[10000];
		}

		/** value will always be non-negative. */
		public void put(int key, int value) {
			int i = getIdx(key);
			if (nodes[i] == null) {
				nodes[i] = new ListNode(-1, -1);
			}

			ListNode node = find(nodes[i], key);

			if (node.next == null) {
				node.next = new ListNode(key, value);
			} else {
				node.next.val = value;
			}
		}

		/**
		 * Returns the value to which the specified key is mapped, or -1 if this map
		 * contains no mapping for the key
		 */

		public int get(int key) {
			int i = getIdx(key);
			if (nodes[i] == null) {
				return -1;
			}
			
			ListNode node = find(nodes[i], key);
			
			return node.next == null ? -1 : node.next.val;
		}

		/**
		 * Removes the mapping of the specified value key if this map contains a mapping
		 * for the key
		 */
		public void remove(int key) {
			int i = getIdx(key);
			
			if (nodes[i] == null) {
				return;
			}
				
			ListNode node = find(nodes[i], key);
			if (node.next == null) {
				return;				
			}

			node.next = node.next.next;
		}
	}
}
