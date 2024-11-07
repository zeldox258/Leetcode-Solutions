class Solution {
    public int minimumChairs(String s) {
        int ans = 0, count = 0;
        char ch[] = s.toCharArray();
        for(char c:ch){
            if(c=='E'){
                count++;
            }
            else{
                count--;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}