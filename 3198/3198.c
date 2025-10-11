int findCitiesInEachState(struct TreeNode* root) {
    if (!root) return 0;
    int l = findCitiesInEachState(root->left);
    int r = findCitiesInEachState(root->right);
    return 1 + (l > r ? l : r);
}