
import java.util.*;
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res=new ArrayList<>();
        for(int h=0;h<12;h++) for(int m=0;m<60;m++)
            if(Integer.bitCount(h)+Integer.bitCount(m)==num)
                res.add(h+":"+(m<10?"0"+m:m));
        return res;
    }
}
