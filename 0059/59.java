class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1,num=1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++) m[top][i]=num++;top++;
            for(int i=top;i<=bottom;i++) m[i][right]=num++;right--;
            if(top<=bottom){for(int i=right;i>=left;i--) m[bottom][i]=num++;bottom--;}
            if(left<=right){for(int i=bottom;i>=top;i--) m[i][left]=num++;left++;}
        }
        return m;
    }
}