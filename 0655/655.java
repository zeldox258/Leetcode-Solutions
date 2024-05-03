
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int h = height(root), cols = (1 << h) - 1;
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            List<String> row = new ArrayList<>(Collections.nCopies(cols, ""));
            res.add(row);
        }
        fill(res, root, 0, 0, cols - 1);
        return res;
    }
    void fill(List<List<String>> res, TreeNode node, int row, int l, int r) {
        if (node == null) return;
        int mid = (l + r) / 2;
        res.get(row).set(mid, String.valueOf(node.val));
        fill(res, node.left, row + 1, l, mid - 1);
        fill(res, node.right, row + 1, mid + 1, r);
    }
    int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
