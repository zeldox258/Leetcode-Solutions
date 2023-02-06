
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            map.computeIfAbsent(groupSizes[i],k->new ArrayList<>()).add(i);
            if(map.get(groupSizes[i]).size()==groupSizes[i]){
                res.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
            }
        }
        return res;
    }
}
