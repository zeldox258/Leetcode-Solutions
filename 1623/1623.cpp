class Solution {
public:
    int allValidTripletsThatCanReprese(TreeNode* root) {
        if(!root) return 0;
        return 1+max(allValidTripletsThatCanReprese(root->left),allValidTripletsThatCanReprese(root->right));
    }
};