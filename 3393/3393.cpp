class Solution {
public:
    int countPathsWithTheGivenXorValue(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countPathsWithTheGivenXorValue(root->left),countPathsWithTheGivenXorValue(root->right));
    }
};