int earliestSecondToMarkIndicesI(struct TreeNode* root) {
    if (!root) return 0;
    int l = earliestSecondToMarkIndicesI(root->left);
    int r = earliestSecondToMarkIndicesI(root->right);
    return 1 + (l > r ? l : r);
}