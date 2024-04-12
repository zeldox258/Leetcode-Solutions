int houseRobberIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = houseRobberIi(root->left);
    int r = houseRobberIi(root->right);
    return 1 + (l > r ? l : r);
}