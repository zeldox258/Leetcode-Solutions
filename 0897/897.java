
class Solution {
    List<Integer> vals = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode dummy = new TreeNode(0), cur = dummy;
        for (int v : vals) { cur.right = new TreeNode(v); cur = cur.right; }
        return dummy.right;
    }
    void inorder(TreeNode node) { if (node==null) return; inorder(node.left); vals.add(node.val); inorder(node.right); }
}
