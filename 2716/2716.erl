minimized_string_length(S) ->
    ListChars = binary_to_list(S),
    UniqueChars = lists:usort(ListChars),
    length(UniqueChars).