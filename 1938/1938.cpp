class Solution {
public:
    int maximumGeneticDifferenceQuery(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumGeneticDifferenceQuery(root->left),maximumGeneticDifferenceQuery(root->right));
    }
};