int dynamicUnpivotingOfATable(struct TreeNode* root) {
    if (!root) return 0;
    int l = dynamicUnpivotingOfATable(root->left);
    int r = dynamicUnpivotingOfATable(root->right);
    return 1 + (l > r ? l : r);
}