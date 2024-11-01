class Solution {
public:
    int getBiggestThreeRhombusSumsInAG(TreeNode* root) {
        if(!root) return 0;
        return 1+max(getBiggestThreeRhombusSumsInAG(root->left),getBiggestThreeRhombusSumsInAG(root->right));
    }
};