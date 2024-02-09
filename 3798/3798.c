int largestEvenNumber(struct TreeNode* root) {
    if (!root) return 0;
    int l = largestEvenNumber(root->left);
    int r = largestEvenNumber(root->right);
    return 1 + (l > r ? l : r);
}