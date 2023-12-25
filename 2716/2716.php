class Solution {

    /**
    * @param String $s
    * @return Integer
    */
    function minimizedStringLength($s) {
        $uniqueChars = [];
        $length = 0;

        for ($i = 0; $i < strlen($s); $i++) {
            $char = $s[$i];
            if (!isset($uniqueChars[$char])) {
                $uniqueChars[$char] = true;
                $length++;
            }
        }

        return $length;
    }
}