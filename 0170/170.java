import java.util.*;
class TwoSum {
    private List<Integer> nums=new ArrayList<>();
    public void add(int number){nums.add(number);}
    public boolean find(int value){
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){int comp=value-n;if(map.containsKey(comp))return true;map.put(n,map.getOrDefault(n,0)+1);}
        return false;
    }
}