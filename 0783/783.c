int minimumDistanceBetweenBstNodes(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumDistanceBetweenBstNodes(root->left);
    int r = minimumDistanceBetweenBstNodes(root->right);
    return 1 + (l > r ? l : r);
}