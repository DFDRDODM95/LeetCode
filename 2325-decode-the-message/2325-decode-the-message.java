class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Integer> keyCount = new HashMap<Character, Integer>();

        int alpha = (int)'a';
        HashMap<Character, Character> parser = new HashMap<Character, Character>();
        for (char letter : key.toCharArray()) {
            if (keyCount.get(letter) == null && letter != ' ') {
                keyCount.put(letter, 1);
                parser.put(letter, (char)alpha++);
            }
        }
        parser.put(' ', ' ');

        StringBuilder builder = new StringBuilder();
        for (char letter : message.toCharArray()) {
            builder.append(parser.get(letter));
        }

        return builder.toString();

    }
}