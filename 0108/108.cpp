class Solution {
public:
    int convertSortedArrayToBinarySear(TreeNode* root) {
        if(!root) return 0;
        return 1+max(convertSortedArrayToBinarySear(root->left),convertSortedArrayToBinarySear(root->right));
    }
};