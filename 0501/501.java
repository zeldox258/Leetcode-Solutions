
class Solution {
    int prev = Integer.MIN_VALUE, curCnt = 0, maxCnt = 0;
    List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        return modes.stream().mapToInt(Integer::intValue).toArray();
    }
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        curCnt = (node.val == prev) ? curCnt + 1 : 1;
        prev = node.val;
        if (curCnt > maxCnt) { maxCnt = curCnt; modes.clear(); modes.add(node.val); }
        else if (curCnt == maxCnt) modes.add(node.val);
        inorder(node.right);
    }
}
