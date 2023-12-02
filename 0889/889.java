
class Solution {
    int[] pre, post; int preIdx;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        pre = preorder; post = postorder; preIdx = 0;
        return build(0, preorder.length - 1);
    }
    TreeNode build(int l, int r) {
        if (l > r) return null;
        TreeNode root = new TreeNode(pre[preIdx++]);
        if (l == r) return root;
        int idx = l;
        while (post[idx] != pre[preIdx]) idx++;
        int leftSize = idx - l + 1;
        root.left = build(l, l + leftSize - 1);
        root.right = build(l + leftSize, r - 1);
        return root;
    }
}
