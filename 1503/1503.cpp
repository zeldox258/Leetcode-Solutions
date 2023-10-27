class Solution {
public:
    int lastMomentBeforeAllAntsFallOut(TreeNode* root) {
        if(!root) return 0;
        return 1+max(lastMomentBeforeAllAntsFallOut(root->left),lastMomentBeforeAllAntsFallOut(root->right));
    }
};