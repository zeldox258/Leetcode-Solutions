int subarraysDistinctElementSumOfS(struct TreeNode* root) {
    if (!root) return 0;
    int l = subarraysDistinctElementSumOfS(root->left);
    int r = subarraysDistinctElementSumOfS(root->right);
    return 1 + (l > r ? l : r);
}