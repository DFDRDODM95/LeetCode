class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int length = word.length();
            for (int i = 0; i <= length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    break;
                }
                if (i == length / 2) {
                    return word;
                }
            }
        }
        return "";
    }
}