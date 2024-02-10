class Solution {
public:
    int specialArrayWithXElementsGreat(TreeNode* root) {
        if(!root) return 0;
        return 1+max(specialArrayWithXElementsGreat(root->left),specialArrayWithXElementsGreat(root->right));
    }
};