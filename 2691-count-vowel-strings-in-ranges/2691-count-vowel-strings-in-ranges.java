class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] res=new int[queries.length];
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int[] pre_sum = new int[words.length];
        int sum=0;
        for (int i = 0; i < words.length; i++) {
            String curr_word = words[i];
            if (
                vowels.contains(curr_word.charAt(0)) &&
                vowels.contains(curr_word.charAt(curr_word.length() - 1))
            ) {
                sum++;
            }
            pre_sum[i] = sum;
        }
        for (int i = 0; i < queries.length; i++) {
            int[] curr = queries[i];
            res[i] =pre_sum[curr[1]] - (curr[0] == 0 ? 0 : pre_sum[curr[0] - 1]);
        }
        return res;
    }
}