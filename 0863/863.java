
class Solution {
    Map<TreeNode, TreeNode> parent = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root, null);
        List<Integer> res = new ArrayList<>();
        dfs(target, null, k, res);
        return res;
    }
    void buildParent(TreeNode node, TreeNode par) {
        if (node == null) return;
        parent.put(node, par);
        buildParent(node.left, node);
        buildParent(node.right, node);
    }
    void dfs(TreeNode node, TreeNode from, int dist, List<Integer> res) {
        if (node == null) return;
        if (dist == 0) { res.add(node.val); return; }
        if (node.left != from) dfs(node.left, node, dist - 1, res);
        if (node.right != from) dfs(node.right, node, dist - 1, res);
        if (parent.get(node) != from) dfs(parent.get(node), node, dist - 1, res);
    }
}
