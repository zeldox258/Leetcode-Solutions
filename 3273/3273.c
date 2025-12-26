int minimumAmountOfDamageDealtToBo(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumAmountOfDamageDealtToBo(root->left);
    int r = minimumAmountOfDamageDealtToBo(root->right);
    return 1 + (l > r ? l : r);
}