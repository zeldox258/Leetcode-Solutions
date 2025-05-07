int consecutiveAvailableSeats(struct TreeNode* root) {
    if (!root) return 0;
    int l = consecutiveAvailableSeats(root->left);
    int r = consecutiveAvailableSeats(root->right);
    return 1 + (l > r ? l : r);
}