class Solution {
    func minimizedStringLength(_ s: String) -> Int {
        var uniqueChars = Set<Character>()
        
        for char in s {
            uniqueChars.insert(char)
        }
        
        return uniqueChars.count
    }
}