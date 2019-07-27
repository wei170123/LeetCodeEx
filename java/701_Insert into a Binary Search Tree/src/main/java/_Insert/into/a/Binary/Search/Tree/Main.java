package _Insert.into.a.Binary.Search.Tree;

public class Main {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		TreeNode root = null;
		int val = 10;

		TreeNode result = insertIntoBST(root, val);
		System.out.println(result.val);
	}

	public static TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			root = new TreeNode(val);
		}
		else if (root.val > val) {
			root.left = insertIntoBST(root.left, val);
		}

		else {
			root.right = insertIntoBST(root.right, val);
		}

		return root;
	}

}
