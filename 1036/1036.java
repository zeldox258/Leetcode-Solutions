
class Solution {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if(blocked.length==0)return true;
        java.util.Set<Long> bl=new java.util.HashSet<>(); for(int[]b:blocked)bl.add((long)b[0]*1000000+b[1]);
        int maxArea=blocked.length*blocked.length/2;
        return bfs(source,target,bl,maxArea)&&bfs(target,source,bl,maxArea);
    }
    boolean bfs(int[]src,int[]tgt,java.util.Set<Long>bl,int maxArea){
        java.util.Set<Long>visited=new java.util.HashSet<>();java.util.Queue<int[]>q=new java.util.LinkedList<>();q.offer(src);visited.add((long)src[0]*1000000+src[1]);int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){int[]c=q.poll();for(int[]d:dirs){int x=c[0]+d[0],y=c[1]+d[1];if(x<0||y<0||x>=1000000||y>=1000000)continue;long key=(long)x*1000000+y;if(bl.contains(key)||visited.contains(key))continue;if(x==tgt[0]&&y==tgt[1])return true;visited.add(key);q.offer(new int[]{x,y});if(visited.size()>maxArea)return true;}}
        return false;
    }
}
