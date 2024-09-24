int kthSmallestElementInASortedMat(struct TreeNode* root) {
    if (!root) return 0;
    int l = kthSmallestElementInASortedMat(root->left);
    int r = kthSmallestElementInASortedMat(root->right);
    return 1 + (l > r ? l : r);
}