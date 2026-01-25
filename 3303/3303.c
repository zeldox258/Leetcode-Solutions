int findTheOccurrenceOfFirstAlmost(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheOccurrenceOfFirstAlmost(root->left);
    int r = findTheOccurrenceOfFirstAlmost(root->right);
    return 1 + (l > r ? l : r);
}