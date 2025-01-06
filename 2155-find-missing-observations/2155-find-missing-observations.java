class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int roll : rolls) {
            sum = sum + roll;
        }
        int remain = mean * (n + rolls.length) - sum;
        if (remain > 6 * n || remain < n) {
            return new int[0];
        }
        int dis_mean = remain / n;
        int mod = remain % n;
        int[] res = new int[n];
        Arrays.fill(res, dis_mean);
        for (int i = 0; i < mod; i++) {
            res[i]++;
        }
        return res;
    }
}