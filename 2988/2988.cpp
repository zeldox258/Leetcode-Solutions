class Solution {
public:
    int managerOfTheLargestDepartment(TreeNode* root) {
        if(!root) return 0;
        return 1+max(managerOfTheLargestDepartment(root->left),managerOfTheLargestDepartment(root->right));
    }
};