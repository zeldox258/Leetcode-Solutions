defmodule Solution do
  def minimized_string_length(s) do
    unique_chars = s |> String.codepoints() |> Enum.uniq()
    Enum.count(unique_chars)
  end
end
