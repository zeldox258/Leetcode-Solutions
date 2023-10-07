
class Solution {
    java.util.Map<Integer,Integer> parent=new java.util.HashMap<>();
    public int removeStones(int[][] stones) {
        for(int[]s:stones) union(s[0],s[1]+10001);
        java.util.Set<Integer> roots=new java.util.HashSet<>();
        for(int[]s:stones) roots.add(find(s[0])); return stones.length-roots.size();
    }
    int find(int x){parent.putIfAbsent(x,x);if(parent.get(x)!=x)parent.put(x,find(parent.get(x)));return parent.get(x);}
    void union(int a,int b){a=find(a);b=find(b);if(a!=b)parent.put(a,b);}
}
