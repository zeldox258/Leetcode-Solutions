
class Solution {
    public java.util.List<Integer> powerfulIntegers(int x, int y, int bound) {
        java.util.Set<Integer> res=new java.util.HashSet<>();
        for(int i=0;i<20;i++){for(int j=0;j<20;j++){int v=(int)Math.pow(x,i)+(int)Math.pow(y,j);if(v<=bound)res.add(v);if(y==1)break;}if(x==1)break;}
        return new java.util.ArrayList<>(res);
    }
}
