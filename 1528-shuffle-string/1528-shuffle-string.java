class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < map.size(); i++) {
            builder.append(map.get(i));
        }
        return builder.toString();
    }
}