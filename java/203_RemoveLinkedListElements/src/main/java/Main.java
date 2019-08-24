
public class Main {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		// [1,2,6,3,4,5,6]
		// [1,1]
		// [1]
		// [1,2,2,1]
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);

		int val = 6;

		ListNode result = head;

		while (head != null && head.val == val) {
			head = head.next;
			result = head;
		}

		while (head != null) {
			while (head.next != null && head.next.val == val) {
				head.next = head.next.next;
			}
			head = head.next;
		}

		System.out.println(result);
		// return head;
	}

}
