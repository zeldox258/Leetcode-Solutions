class Solution {
    public boolean canBeValid(String s, String locked) {
        int n =s.length();
        Stack<Integer> st= new Stack<>();
        Stack<Integer > st2 = new Stack<>(); // for store the locked '('

        if(n%2!=0) return false ;
        // int count =0 ;
        // for(int i =0; i<n; i++) if(locked.charAt(i)=='1') count++;

        if(s.charAt(0)==')' && locked.charAt(0)=='1') return false;
        if(s.charAt(s.length()-1)=='(' && locked.charAt(n-1)=='1') return false;
        // if(count<= n/2) return true;
        st.push(0);
        for(int i =1;i<n; i++){
          char ch = s.charAt(i);
          if(ch==')' && locked.charAt(i)=='1'){
            // pop out time
            if(st.isEmpty() && st2.isEmpty())return false ;

            if(!st2.isEmpty()){
                st2.pop();
            }else {
                st.pop();
            }

          }else {
            if(locked.charAt(i)=='1'){
                st2.push(i);
            }
            else {
                st.push(i);
            }
          }
        }

        while(!st2.isEmpty()){
            int ind= st2.pop();
            if(st.peek()<ind){
                return false ;
            }
           st.pop();
        }
        return true;

    }
}