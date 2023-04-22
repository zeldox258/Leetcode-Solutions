
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res=0;
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(Integer.MAX_VALUE);
        for(int a:arr){
            while(stack.peek()<=a){
                int mid=stack.pop();
                res+=mid*Math.min(stack.peek(),a);
            }
            stack.push(a);
        }
        while(stack.size()>1){
            int mid=stack.pop();
            res+=mid*stack.peek();
        }
        return res;
    }
}
