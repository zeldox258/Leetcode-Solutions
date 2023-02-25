
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res=new ArrayList<>();
        for(int x=1;x<=1000;x++){
            int lo=1,hi=1000;
            while(lo<=hi){
                int m=(lo+hi)/2;
                int v=customfunction.f(x,m);
                if(v==z){res.add(Arrays.asList(x,m));break;}
                else if(v<z) lo=m+1; else hi=m-1;
            }
        }
        return res;
    }
}
