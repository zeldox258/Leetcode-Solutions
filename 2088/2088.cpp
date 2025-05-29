class Solution {
public:
    int countFertilePyramidsInALand(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countFertilePyramidsInALand(root->left),countFertilePyramidsInALand(root->right));
    }
};