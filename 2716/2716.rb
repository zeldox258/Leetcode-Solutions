# @param {String} s
# @return {Integer}
def minimized_string_length(s)
    unique_chars = s.chars.uniq
    unique_chars.length
end