import java.util.*;
class Solution {
    public List<String> findStrobogrammatic(int n) {
        return find(n,n);
    }
    List<String> find(int n,int total){
        if(n==0) return new ArrayList<>(Arrays.asList(""));
        if(n==1) return new ArrayList<>(Arrays.asList("0","1","8"));
        List<String> middles=find(n-2,total);
        List<String> res=new ArrayList<>();
        for(String mid:middles){
            if(n!=total)res.add("0"+mid+"0");
            res.add("1"+mid+"1");res.add("6"+mid+"9");res.add("8"+mid+"8");res.add("9"+mid+"6");
        }
        return res;
    }
}