
class Solution {
    public int numberOfDays(int year, int month) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2&&(year%4==0&&(year%100!=0||year%400==0))) return 29;
        return days[month-1];
    }
}
