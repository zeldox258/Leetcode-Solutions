class Solution {
    public int maxArea(int[] height) {
        int start = 0 , end = height.length-1,temp,result = 0;

        while(start < end){
            if(height[start] > height[end]){
                result = Math.max(result, height[end]*(end-start));
                temp = end;
                while(start < end && height[end] <= height[temp]) end--;
            }
            else{
                result = Math.max(result, height[start]*(end-start));
                temp = start;
                while(start < end && height[start] <= height[temp]) start++;
            }
        }

        return result;
    }
}