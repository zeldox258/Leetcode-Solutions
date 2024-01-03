class Solution {
public:
    int maxArea(vector<int>& height) {
        int start = 0 , end = height.size() - 1 , result = 0;
        while(end > start){
            result = max(result ,min(height[start],height[end]) * (end - start));
            if(height[start] > height[end])end--;
            else if(height[start] < height[end])start++;
            else if(height[start+1] > height[end-1])start++;
            else end--;
        }
        return result;
    }
};