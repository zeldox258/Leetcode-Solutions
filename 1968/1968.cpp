class Solution {
public:
    int arrayWithElementsNotEqualToAve(TreeNode* root) {
        if(!root) return 0;
        return 1+max(arrayWithElementsNotEqualToAve(root->left),arrayWithElementsNotEqualToAve(root->right));
    }
};