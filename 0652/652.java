
class Solution {
    Map<String, Integer> count = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return res;
    }
    String serialize(TreeNode node) {
        if (node == null) return '#';
        String key = node.val + ',' + serialize(node.left) + ',' + serialize(node.right);
        count.put(key, count.getOrDefault(key, 0) + 1);
        if (count.get(key) == 2) res.add(node);
        return key;
    }
}
