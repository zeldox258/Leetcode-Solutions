int allValidTripletsThatCanReprese(struct TreeNode* root) {
    if (!root) return 0;
    int l = allValidTripletsThatCanReprese(root->left);
    int r = allValidTripletsThatCanReprese(root->right);
    return 1 + (l > r ? l : r);
}