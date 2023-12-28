class Solution {
public:
    int stoneGameV(TreeNode* root) {
        if(!root) return 0;
        return 1+max(stoneGameV(root->left),stoneGameV(root->right));
    }
};