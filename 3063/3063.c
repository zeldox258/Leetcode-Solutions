int linkedListFrequency(struct TreeNode* root) {
    if (!root) return 0;
    int l = linkedListFrequency(root->left);
    int r = linkedListFrequency(root->right);
    return 1 + (l > r ? l : r);
}