use std::collections::HashSet;


impl Solution {
    pub fn minimized_string_length(s: String) -> i32 {
        let unique_chars: HashSet<_> = s.chars().collect();
        unique_chars.len() as i32
    }
}