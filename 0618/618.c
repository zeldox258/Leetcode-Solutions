int studentsReportByGeography(struct TreeNode* root) {
    if (!root) return 0;
    int l = studentsReportByGeography(root->left);
    int r = studentsReportByGeography(root->right);
    return 1 + (l > r ? l : r);
}