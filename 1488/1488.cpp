class Solution {
public:
    int avoidFloodInTheCity(TreeNode* root) {
        if(!root) return 0;
        return 1+max(avoidFloodInTheCity(root->left),avoidFloodInTheCity(root->right));
    }
};