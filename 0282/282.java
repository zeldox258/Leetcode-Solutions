import java.util.*;
class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res=new ArrayList<>();
        bt(res,num,target,"",0,0,0);
        return res;
    }
    void bt(List<String> res,String num,int target,String path,int pos,long eval,long mult){
        if(pos==num.length()){if(eval==target)res.add(path);return;}
        for(int i=pos+1;i<=num.length();i++){
            String s=num.substring(pos,i);
            if(s.length()>1&&s.charAt(0)=='0') break;
            long cur=Long.parseLong(s);
            if(pos==0){bt(res,num,target,s,i,cur,cur);}
            else{
                bt(res,num,target,path+"+"+s,i,eval+cur,cur);
                bt(res,num,target,path+"-"+s,i,eval-cur,-cur);
                bt(res,num,target,path+"*"+s,i,eval-mult+mult*cur,mult*cur);
            }
        }
    }
}