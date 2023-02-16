
class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        Map<String,String> parent=new HashMap<>();
        for(List<String> r:regions) for(int i=1;i<r.size();i++) parent.put(r.get(i),r.get(0));
        Set<String> ancestors=new HashSet<>();
        String cur=region1;
        while(cur!=null){ancestors.add(cur);cur=parent.get(cur);}
        cur=region2;
        while(!ancestors.contains(cur)) cur=parent.get(cur);
        return cur;
    }
}
