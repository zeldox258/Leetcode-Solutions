class Solution {
public:
    int minimumTimeToKillAllMonsters(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumTimeToKillAllMonsters(root->left),minimumTimeToKillAllMonsters(root->right));
    }
};