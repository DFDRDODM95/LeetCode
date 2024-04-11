class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Stack <Character> stk = new Stack<>();
        for (char letter : s.toCharArray()) {
            if (stk.size() == 0) stk.push(letter);
            else if (stk.peek() == map.get(letter)) stk.pop();
            else stk.push(letter);
        }
        
        return stk.size() == 0 ? true : false;
    }
}