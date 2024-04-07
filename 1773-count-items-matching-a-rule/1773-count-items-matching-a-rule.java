class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map= new HashMap<String, Integer>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        
        int count = 0;
        int pos = map.get(ruleKey);
        for (List<String> list : items) {
            if (list.get(pos).equals(ruleValue)) count++;
        }
        
        return count;
    }
}