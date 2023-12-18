class Solution {
    public int countSeniors(String[] details) {
        int result=0;
        for (int i=0;i<details.length;i++){
            int age = Integer.parseInt(details[i].substring(11,13));
            if( age > 60 ) {
                 result++;
            }
        }
        return result;
    }
}