public class Main {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);

		ListNode result = null;
		ListNode tmp = null;

		while (head != null) {
			if(result == null) {
				result = new ListNode(head.val);
			}
			else {
				tmp = result;
				result = new ListNode(head.val);
				result.next = tmp;
			}
			
			head = head.next;
		}
		
		System.out.println(result);
//		return result;
	}

}
