class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String str : operations) {
            String removed = str.replace("X", "");
            if (removed.equals("++")) result++;
            else result--;
        }
        
        return result;
    }
}