int sumOfImbalanceNumbersOfAllSuba(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfImbalanceNumbersOfAllSuba(root->left);
    int r = sumOfImbalanceNumbersOfAllSuba(root->right);
    return 1 + (l > r ? l : r);
}