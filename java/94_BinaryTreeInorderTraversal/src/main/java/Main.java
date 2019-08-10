import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2147483647);
		root.left = new TreeNode(214748364);
		root.left.left = new TreeNode(21474836);

		List<Integer> tmp = new ArrayList<Integer>();

//		List<Integer> result = inorderTraversalRecursive(root, tmp);
		List<Integer> result = inorderTraversalStack(root, tmp);

		// return result;
		System.out.println(result);
	}

	public static List<Integer> inorderTraversalRecursive(TreeNode root, List<Integer> result) {

		// if (root.left != null) {
		// result.addAll(inorderTraversalRecursive(root.left, result));
		// } else if (root.right != null) {
		// result.addAll(inorderTraversalRecursive(root.right, result));
		// } else {
		// result.add(root.val);
		// }
		//
		if (root == null) {
			return result;
		}

		if (root.left != null) {
			inorderTraversalRecursive(root.left, result);
		}

		result.add(root.val);

		if (root.right != null) {
			inorderTraversalRecursive(root.right, result);
		}

		System.out.println(result);
		System.out.println(root.val);

		return result;
	}

	public static List<Integer> inorderTraversalStack(TreeNode root, List<Integer> result) {

		if (root == null) {
			return result;
		}

		TreeNode p = root;
		Stack<TreeNode> st = new Stack<>();

		while (p != null || !st.isEmpty()) {
			if (p != null) {
				st.push(p);
				p = p.left;
			} else {
				p = st.pop();
				result.add(p.val);
				p = p.right;
			}
		}
		return result;
	}
}
