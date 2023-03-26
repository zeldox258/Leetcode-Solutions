
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> idx=new HashMap<>();
        for(int i=0;i<list1.length;i++) idx.put(list1[i],i);
        int minSum=Integer.MAX_VALUE;
        List<String> res=new ArrayList<>();
        for(int j=0;j<list2.length;j++){
            if(idx.containsKey(list2[j])){
                int s=idx.get(list2[j])+j;
                if(s<minSum){minSum=s;res.clear();res.add(list2[j]);}
                else if(s==minSum) res.add(list2[j]);
            }
        }
        return res.toArray(new String[0]);
    }
}
