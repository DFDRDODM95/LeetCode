class Solution {
        public int[] twoSum(int[] nums, int target) {
            return backtracking(nums, target, 0, new ArrayList<Integer>());
        }

        private int[] backtracking(int[] nums, int target, int start, List<Integer> ans) {
            if (ans.size() == 2) {
                if (nums[ans.get(0)] + nums[ans.get(1)] == target) {
                    return new int[]{ans.get(0), ans.get(1)};
                }
                return null;
            }
            for (int i = start; i < nums.length; i++) {
                ans.add(i);
                int[] result = backtracking(nums, target, i + 1, ans);
                if (result != null) {
                    return result;
                }
                ans.remove(ans.size() - 1);
            }
            return null;
        }
}