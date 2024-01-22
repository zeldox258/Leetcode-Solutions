int maximumNumberOfEventsThatCanBe(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfEventsThatCanBe(root->left);
    int r = maximumNumberOfEventsThatCanBe(root->right);
    return 1 + (l > r ? l : r);
}