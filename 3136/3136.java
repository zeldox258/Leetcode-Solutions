class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean ans = false;
        
        for(int i=0;i<word.length();i++){
            char val = word.charAt(i);

            if(val<='9'&&val>='0'){ans=true;}
            else if(val<='z'&&val>='a'){ans=true;}
            else if(val<='Z'&&val>='A'){ans=true;}
            else return false;
            
        }
        
        if(ans == false)    return ans;
        
        String data = "aeiouAEIOU";
        boolean ans1 = false;
        boolean ans2 = false;
        
        for(int i=0;i<word.length();i++){
            char val = word.charAt(i);
            if(data.contains(String.valueOf(val))){ans1=true;}
            else if((val<='z'&&val>='a') || (val<='Z'&&val>='A')) ans2 = true;
            
        }
        
        return ans1&ans2;
    }
}