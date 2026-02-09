/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void traverseInorder(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        if (root.left != null) traverseInorder(root.left, list);
        list.add(root);
        if (root.right != null) traverseInorder(root.right, list);
    }

    public TreeNode balanceBST(List<TreeNode> list, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode newRoot = list.get(mid);
        newRoot.left = balanceBST(list, l, mid - 1);
        newRoot.right = balanceBST(list, mid + 1, r);
        return newRoot;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        traverseInorder(root, list);
        TreeNode newRoot = balanceBST(list, 0, list.size() - 1);
        return newRoot;
    }
}