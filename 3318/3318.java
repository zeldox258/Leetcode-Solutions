class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        
        int[] ans = new int[n-k+1];
        for(int i=0; i<n-k+1; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=i; j<i+k; j++){
                map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            }
            
            List<Pair> list = new ArrayList<>();
            for(int key:map.keySet()){
                list.add(new Pair(map.get(key), key));
            }
            Collections.sort(list, (Pair a, Pair b)->{
                if(a.first==b.first){
                    return b.second-a.second;
                }
                return b.first-a.first;
            });
            
            int sum = 0;
            int uniq = 0;
            for(Pair l:list){
                if(uniq >= x){
                    break;
                }
                
                sum += l.first*l.second;
                uniq++;
            }
            ans[i]=sum;
        }
        return ans;
    }
}