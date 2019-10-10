public class Main {

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(1);
		linkedList.addAtIndex(1, 2);
		System.out.println("--");
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
	}

	static class MyLinkedList {

		class ListNode {
			int val;
			ListNode next;

			ListNode(int val) {
				this.val = val;
				this.next = null;
			}
		}

		ListNode head = null;

		/** Initialize your data structure here. */
		public MyLinkedList() {

		}

		/**
		 * Get the value of the index-th node in the linked list. If the index is
		 * invalid, return -1.
		 */
		public int get(int index) {
			if (head == null) {
				return -1;
			} 
			else if (index == 0) {
				return head.val;
			} else {
				ListNode tmp = head;
				int counter = 0;

				while (tmp.next != null) {
					counter++;
					tmp = tmp.next;

					if (counter == index) {
						return tmp.val;
					}
				}

				return -1;
			}
		}

		/**
		 * Add a node of value val before the first element of the linked list. After
		 * the insertion, the new node will be the first node of the linked list.
		 */
		public void addAtHead(int val) {
			if (head == null) {
				head = new ListNode(val);
			} else {
				ListNode tmp = head;
				head = new ListNode(val);
				head.next = tmp;
			}
		}

		/** Append a node of value val to the last element of the linked list. */
		public void addAtTail(int val) {
			if (head == null) {
				head = new ListNode(val);
			} else {
				ListNode tmp = head;
				while (tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = new ListNode(val);
			}
		}

		/**
		 * Add a node of value val before the index-th node in the linked list. If index
		 * equals to the length of linked list, the node will be appended to the end of
		 * linked list. If index is greater than the length, the node will not be
		 * inserted.
		 */
		public void addAtIndex(int index, int val) {
			if (index < 0) {
				head = new ListNode(val);
			} else if (index == 0 && head == null) {
				head = new ListNode(val);
			} else if (index == 0) {
				ListNode tmp = head;
				head = new ListNode(val);
				head.next = tmp;
			} else {
				ListNode tmp = head;
				int counter = 0;

				while (tmp != null) {
					counter++;

					if (counter == index) {
						if (tmp.next == null) {
							tmp.next = new ListNode(val);
						} else {
							ListNode tmptmp = tmp.next;
							tmp.next = new ListNode(val);
							tmp.next.next = tmptmp;
						}

						break;
					}
					tmp = tmp.next;
				}
			}
		}

		/** Delete the index-th node in the linked list, if the index is valid. */
		public void deleteAtIndex(int index) {
			if (index < 0) {

			} else if (index == 0 && head == null) {

			} else if (index == 0) {
				head = head.next;
			} else {
				ListNode tmp = head;
				int counter = 0;

				while (tmp.next != null) {
					counter++;

					if (counter == index) {
						ListNode tmptmp = tmp.next;
						tmp.next = tmptmp.next;

						break;
					}
					tmp = tmp.next;
				}
			}
		}
	}

}
