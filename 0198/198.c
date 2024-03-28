int houseRobber(struct TreeNode* root) {
    if (!root) return 0;
    int l = houseRobber(root->left);
    int r = houseRobber(root->right);
    return 1 + (l > r ? l : r);
}