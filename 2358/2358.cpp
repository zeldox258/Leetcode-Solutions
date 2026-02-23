class Solution {
public:
    int maximumNumberOfGroupsEnteringA(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfGroupsEnteringA(root->left),maximumNumberOfGroupsEnteringA(root->right));
    }
};