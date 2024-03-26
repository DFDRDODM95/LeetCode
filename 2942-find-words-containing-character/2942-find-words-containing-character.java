import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        return IntStream.range(0, words.length)
                        .filter(i -> words[i].contains(String.valueOf(x)))
                        .boxed()
                        .collect(Collectors.toList());
    }
}