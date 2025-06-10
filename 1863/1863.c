int sumOfAllSubsetXorTotals(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfAllSubsetXorTotals(root->left);
    int r = sumOfAllSubsetXorTotals(root->right);
    return 1 + (l > r ? l : r);
}