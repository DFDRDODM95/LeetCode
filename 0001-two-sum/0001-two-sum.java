class Solution {
    public int[] twoSum(int[] nums, int target) {
    return backtracking(nums, target, 0, new ArrayList<Integer>(), 2);
  }

  private int[] backtracking(int[] nums, int target, int start, List<Integer> ans, int k) {
    if (ans.size() == k) {
      int sum = 0;
      for(int idx : ans) {
        sum += nums[idx];
      }
      if (sum == target) {
        return ans.stream().mapToInt(i -> i).toArray();
      }
      return null;
    }

    for (int i = start; i < nums.length; i++) {
      ans.add(i);
      int[] result = backtracking(nums, target, i + 1, ans, k);
      if (result != null) {
        return result;
      }
      ans.remove(ans.size() - 1);
    }
    return null;
  }
}