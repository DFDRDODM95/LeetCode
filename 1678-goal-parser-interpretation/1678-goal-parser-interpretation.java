import java.util.HashMap;
import java.util.Map;

class Solution {
    public String interpret(String command) {
        Map<String, String> interpretations = new HashMap<>();
        interpretations.put("G", "G");
        interpretations.put("()", "o");
        interpretations.put("(al)", "al");

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (char c : command.toCharArray()) {
            temp.append(c);
            String token = temp.toString();
            if (interpretations.containsKey(token)) {
                result.append(interpretations.get(token));
                temp.setLength(0);
            }
        }
        
        return result.toString();
    }
}
