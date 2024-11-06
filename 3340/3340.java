class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        char ch;
        for(int i=0;i<num.length();i++)
            {
                ch=num.charAt(i);
                if(i%2==0)
                    s1+=Integer.parseInt(String.valueOf(ch));
                else
                    s2+=Integer.parseInt(String.valueOf(ch));
            }
        return (s1==s2)?true:false;
    }
}