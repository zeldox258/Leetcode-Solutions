
class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        String res = String.valueOf(root.val);
        String left = tree2str(root.left), right = tree2str(root.right);
        if (left.isEmpty() && right.isEmpty()) return res;
        if (right.isEmpty()) return res + "(" + left + ")";
        return res + "(" + left + ")(" + right + ")";
    }
}
