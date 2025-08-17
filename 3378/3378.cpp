class Solution {
public:
    int countConnectedComponentsInLcmG(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countConnectedComponentsInLcmG(root->left),countConnectedComponentsInLcmG(root->right));
    }
};