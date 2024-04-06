class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for (int i = 1; i < sentences.length; i++) {
            int len = sentences[i].split(" ").length;
            if (len > max) max = len;
        }
        return max;
    }
}