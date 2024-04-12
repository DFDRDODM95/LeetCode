class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.setLength(0);
            
            String pref = word.substring(0, word.length() / 2);
            String postf = builder.append(word.substring((word.length() + 1) / 2)).reverse().toString();
            
            if (pref.equals(postf)) return word;
        }
        return "";
    }
}