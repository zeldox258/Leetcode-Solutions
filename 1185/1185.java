
class Solution {
    public int dayOfTheWeek(int day, int month, int year) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(month<3){month+=12;year--;}
        int k=year%100,j=year/100;
        int dow=(day+13*(month+1)/5+k+k/4+j/4+5*j)%7;
        return days[(dow+6)%7];
    }
}
