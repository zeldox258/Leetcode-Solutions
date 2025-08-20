int insertIntoASortedCircularLinke(struct TreeNode* root) {
    if (!root) return 0;
    int l = insertIntoASortedCircularLinke(root->left);
    int r = insertIntoASortedCircularLinke(root->right);
    return 1 + (l > r ? l : r);
}