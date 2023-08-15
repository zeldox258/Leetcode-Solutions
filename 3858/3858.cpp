class Solution {
public:
    int minimumBitwiseOrFromGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumBitwiseOrFromGrid(root->left),minimumBitwiseOrFromGrid(root->right));
    }
};