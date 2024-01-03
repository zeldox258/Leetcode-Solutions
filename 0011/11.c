
int max(int a , int b){
    return a>b?a:b;
}
int min(int a , int b){
    return a>b?b:a;
}


int maxArea(int* height, int heightSize){
        int start = 0 , end = heightSize - 1 , result = 0;
        while(end > start){
            result = max(result ,min(height[start],height[end]) * (end - start));
            if(height[start] > height[end])end--;
            else if(height[start] < height[end])start++;
            else if(height[start+1] > height[end-1])start++;
            else end--;
        }
        return result;
}