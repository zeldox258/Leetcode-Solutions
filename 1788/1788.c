int maximizeTheBeautyOfTheGarden(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximizeTheBeautyOfTheGarden(root->left);
    int r = maximizeTheBeautyOfTheGarden(root->right);
    return 1 + (l > r ? l : r);
}