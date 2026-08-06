class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j = 0;
        for (int num = 1; num <= target[target.length - 1]; num++) {
            if (num == target[j]) {
                ans.add("Push");
                j++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}