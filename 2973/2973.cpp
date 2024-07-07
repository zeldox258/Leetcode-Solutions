class Solution {
public:
    int findNumberOfCoinsToPlaceInTree(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findNumberOfCoinsToPlaceInTree(root->left),findNumberOfCoinsToPlaceInTree(root->right));
    }
};