class Solution {
public:
    int largestLocalValuesInAMatrix(TreeNode* root) {
        if(!root) return 0;
        return 1+max(largestLocalValuesInAMatrix(root->left),largestLocalValuesInAMatrix(root->right));
    }
};