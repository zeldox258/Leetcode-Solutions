class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int n=matrix[0].length,max=0;
        int[] heights=new int[n];
        for(char[] row:matrix){
            for(int i=0;i<n;i++) heights[i]=row[i]=='0'?0:heights[i]+1;
            max=Math.max(max,largestRect(heights));
        }
        return max;
    }
    int largestRect(int[] h){
        java.util.Deque<Integer> st=new java.util.ArrayDeque<>();
        int max=0,n=h.length;
        for(int i=0;i<=n;i++){
            int cur=i==n?0:h[i];
            while(!st.isEmpty()&&h[st.peek()]>cur){int height=h[st.pop()];int width=st.isEmpty()?i:i-st.peek()-1;max=Math.max(max,height*width);}
            st.push(i);
        }
        return max;
    }
}