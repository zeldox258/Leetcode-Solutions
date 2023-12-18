class Solution {
    public int reverse(int x) {
 int temp = x;
    long result = 0;
    do {
        result = result * 10 + temp % 10;
        temp = temp / 10;
    }while(temp!=0);
    if (result > 2147483647 || result < -2147483647) {
        return 0;
    }
    return (int)result;
    }
}