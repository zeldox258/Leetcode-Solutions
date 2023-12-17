class Solution {

    /**
    * @param Integer[] $nums
    * @param Integer $k
    * @return Integer
    */
    function maximizeSum($nums, $k) {
        $max = max($nums);
        $result = $max;
        for ($i = 1; $i < $k; $i++) {
            $result += ++$max;
        }
        return $result;
    }
}