/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximizeTheBeautyOfTheGarden = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximizeTheBeautyOfTheGarden(root.left), maximizeTheBeautyOfTheGarden(root.right));
};