class Solution {
public:
    int widestPairOfIndicesWithEqualRa(TreeNode* root) {
        if(!root) return 0;
        return 1+max(widestPairOfIndicesWithEqualRa(root->left),widestPairOfIndicesWithEqualRa(root->right));
    }
};