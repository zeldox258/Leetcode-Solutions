
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 1) { res.add(new TreeNode(0)); return res; }
        if (n % 2 == 0) return res;
        for (int i = 1; i < n; i += 2) {
            for (TreeNode l : allPossibleFBT(i)) for (TreeNode r : allPossibleFBT(n-1-i)) {
                TreeNode root = new TreeNode(0); root.left = l; root.right = r; res.add(root);
            }
        }
        return res;
    }
}
