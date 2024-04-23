int maximumPointsActivatedWithOneA(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumPointsActivatedWithOneA(root->left);
    int r = maximumPointsActivatedWithOneA(root->right);
    return 1 + (l > r ? l : r);
}