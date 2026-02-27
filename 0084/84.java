class Solution {
    public int largestRectangleInHistogram(int[] heights) {
        java.util.Deque<Integer> stack=new java.util.ArrayDeque<>();
        int max=0,n=heights.length;
        for(int i=0;i<=n;i++){
            int h=i==n?0:heights[i];
            while(!stack.isEmpty()&&heights[stack.peek()]>h){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
    }
}