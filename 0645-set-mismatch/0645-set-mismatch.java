class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;
        for (int num : nums) {
            if (!set.add(num))
                duplicate = num;
        }
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
}