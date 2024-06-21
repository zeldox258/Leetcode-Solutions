
class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node child : root.children) max = Math.max(max, maxDepth(child));
        return max + 1;
    }
}
