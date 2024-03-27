class Solution {
    public String interpret(String command) {
        List<String> a = Arrays.asList("G", "()", "(al)");
        List<String> b = Arrays.asList("G", "o", "al");

        String temp = "";
        String rst = "";
        for(char c : command.toCharArray()) {
            temp += c;
            int index = a.indexOf(temp);
            if (index != -1) {
                rst += b.get(index);
                temp = "";
            }
        }
        return rst;

    }
}