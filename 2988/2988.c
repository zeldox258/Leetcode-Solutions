int managerOfTheLargestDepartment(struct TreeNode* root) {
    if (!root) return 0;
    int l = managerOfTheLargestDepartment(root->left);
    int r = managerOfTheLargestDepartment(root->right);
    return 1 + (l > r ? l : r);
}