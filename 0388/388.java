
class Solution {
    public int lengthLongestPath(String input) {
        String[] lines=input.split("
"); int res=0;
        int[] stack=new int[lines.length+1];
        for(String line:lines){
            int depth=0; while(depth<line.length()&&line.charAt(depth)=='	') depth++;
            String name=line.substring(depth); stack[depth+1]=stack[depth]+name.length()+1;
            if(name.contains(".")) res=Math.max(res,stack[depth+1]-1);
        }
        return res;
    }
}
