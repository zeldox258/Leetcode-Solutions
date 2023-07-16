class Solution {
public:
    int excelSheetColumnTitle(TreeNode* root) {
        if(!root) return 0;
        return 1+max(excelSheetColumnTitle(root->left),excelSheetColumnTitle(root->right));
    }
};