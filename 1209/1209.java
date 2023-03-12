
class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()[0]==c){
                stack.peek()[1]++;
                if(stack.peek()[1]==k) stack.pop();
            } else stack.push(new int[]{c,1});
        }
        StringBuilder sb=new StringBuilder();
        for(int[] p:stack) for(int i=0;i<p[1];i++) sb.append((char)p[0]);
        return sb.reverse().toString();
    }
}
