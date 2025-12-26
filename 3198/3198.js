/**
 * @param {TreeNode} root
 * @return {number}
 */
var findCitiesInEachState = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findCitiesInEachState(root.left), findCitiesInEachState(root.right));
};