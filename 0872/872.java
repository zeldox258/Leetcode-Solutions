
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        leaves(root1, l1); leaves(root2, l2);
        return l1.equals(l2);
    }
    void leaves(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left == null && node.right == null) { list.add(node.val); return; }
        leaves(node.left, list); leaves(node.right, list);
    }
}
