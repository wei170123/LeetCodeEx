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
//		Integer.MAX_VALUE = 2147483647

		Boolean result = validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.print(result);
	}

	public static Boolean validateBST(TreeNode node, Long min, Long max) {
		if(node == null) {
			return true;
		}
		
		long val = node.val;
		
		return (val > min && val < max && validateBST(node.left, min, val) && validateBST(node.right, val, max));
	}

}
