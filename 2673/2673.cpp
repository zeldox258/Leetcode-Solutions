class Solution {
public:
    int makeCostsOfPathsEqualInABinary(TreeNode* root) {
        if(!root) return 0;
        return 1+max(makeCostsOfPathsEqualInABinary(root->left),makeCostsOfPathsEqualInABinary(root->right));
    }
};