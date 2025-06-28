class Solution {
public:
    int buildTheEquation(TreeNode* root) {
        if(!root) return 0;
        return 1+max(buildTheEquation(root->left),buildTheEquation(root->right));
    }
};