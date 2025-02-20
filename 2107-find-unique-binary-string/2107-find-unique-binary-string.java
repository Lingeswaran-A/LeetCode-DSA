class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> numSet = new HashSet<>();
        for (String num : nums) {
            numSet.add(num);
        }
        return generateBinaryStrings("", numSet, n);
    }
    private String generateBinaryStrings(String current, Set<String> numSet, int n) {
        if (current.length() == n) {
            if (!numSet.contains(current)) {
                return current;
            }
            return null;
        }
        for (char c : new char[]{'0', '1'}) {
            String binaryString = generateBinaryStrings(current + c, numSet, n);
            if (binaryString != null) {
                return binaryString;
            }
        }
        return null;
    }
}