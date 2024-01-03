/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
   var start = 0 , end = height.length - 1 , result = 0;
       while(end > start){
           result = Math.max(result ,Math.min(height[start],height[end]) * (end - start));
           if(height[start] > height[end])end--;
           else if(height[start] < height[end])start++;
           else if(height[start+1] > height[end-1])start++;
           else end--;
       }
       return result;
};