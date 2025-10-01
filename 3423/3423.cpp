class Solution {
public:
    int maximumDifferenceBetweenAdjace(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumDifferenceBetweenAdjace(root->left),maximumDifferenceBetweenAdjace(root->right));
    }
};