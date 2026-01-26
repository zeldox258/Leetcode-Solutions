class Solution {
public:
    int maximumWeightedKedgePath(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumWeightedKedgePath(root->left),maximumWeightedKedgePath(root->right));
    }
};