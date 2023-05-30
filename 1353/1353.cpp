class Solution {
public:
    int maximumNumberOfEventsThatCanBe(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfEventsThatCanBe(root->left),maximumNumberOfEventsThatCanBe(root->right));
    }
};