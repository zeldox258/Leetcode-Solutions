class Solution {
public:
    int maximumPointsActivatedWithOneA(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumPointsActivatedWithOneA(root->left),maximumPointsActivatedWithOneA(root->right));
    }
};