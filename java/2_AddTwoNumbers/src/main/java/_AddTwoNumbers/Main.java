package _AddTwoNumbers;

public class Main {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);

		ListNode result = null;
		result = add(result, l1, l2, false);
		System.out.println(result.val);
		System.out.println(result.next.val);
		// return result;
	}

	public static ListNode add(ListNode result, ListNode l1, ListNode l2, boolean bit) {
		ListNode node = null;

		if (l1 != null && l2 != null) {
			int bitTotal = l1.val + l2.val + (bit ? 1 : 0);
			node = new ListNode(bitTotal - (bitTotal >= 10 ? 10 : 0));
			if (l1.next != null && l2.next != null) {
				node.next = add(node, l1.next, l2.next, bitTotal >= 10 ? true : false);
			} else if (l1.next == null && l2.next != null) {
				node.next = add(node, new ListNode(0), l2.next, bitTotal >= 10 ? true : false);
			} else if (l1.next != null && l2.next == null) {
				node.next = add(node, l1.next, new ListNode(0), bitTotal >= 10 ? true : false);
			} else if(bitTotal >= 10 ? true : false) {
				node.next = add(node, null, null, bitTotal >= 10 ? true : false);
			}
		}
		else if(l1 == null && l2 != null) {
			int bitTotal = l2.val + (bit ? 1 : 0);
			node = new ListNode(bitTotal - (bitTotal >= 10 ? 10 : 0));
			if (l2.next != null) {
				node.next = add(node, null, l2.next, bitTotal >= 10 ? true : false);
			}
		}
		else if(l1 != null && l2 == null) {
			int bitTotal = l1.val + (bit ? 1 : 0);
			node = new ListNode(bitTotal - (bitTotal >= 10 ? 10 : 0));
			if (l1.next != null) {				
				node.next = add(node, l1.next, null, bitTotal >= 10 ? true : false);
			}
		}
		else if(l1 == null && l2 == null) {
			int bitTotal = (bit ? 1 : 0);
			node = new ListNode(bitTotal - (bitTotal >= 10 ? 10 : 0));
		}
		
		return node;
	}
}
