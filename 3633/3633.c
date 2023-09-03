int earliestFinishTimeForLandAndWa(struct TreeNode* root) {
    if (!root) return 0;
    int l = earliestFinishTimeForLandAndWa(root->left);
    int r = earliestFinishTimeForLandAndWa(root->right);
    return 1 + (l > r ? l : r);
}