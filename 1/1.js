/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
        
    let res = [];
    
    for(let i = 0; i < nums.length; i++){     
        let diff = target - nums[i];
        
        if(diff in res){
            return [res[diff], i];
        }        
        res[nums[i]] = i;        
    }
      
};