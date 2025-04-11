class Solution {
    char ans ='a';
    public void operation(String str,int k){
        if(str.length() >= k ){
            ans = str.charAt(k-1);
            return;
        }
        String newstr = "";
        for(int i=0;i<str.length();i++){
            newstr += (char) ( str.charAt(i) + 1);
        }
        operation(str+ newstr, k );
    }
    public char kthCharacter(int k) {
        operation("a", k);
        return ans;
    }
}