class Solution {
public:
    int climbingStairsIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(climbingStairsIi(root->left),climbingStairsIi(root->right));
    }
};