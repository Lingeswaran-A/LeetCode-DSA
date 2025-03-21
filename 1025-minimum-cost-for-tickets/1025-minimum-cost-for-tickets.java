class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        // The last day on which we need to travel.
        int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, -1);
        HashSet<Integer> isTravelNeeded = new HashSet<>();
        // Mark the days on which we need to travel.
        for (int day : days) {
            isTravelNeeded.add(day);
        }
        return solve(dp,days,costs,1,isTravelNeeded);
    }
    private int solve(int[] dp, int[] days, int[] costs, int currDay,HashSet<Integer> isTravelNeeded){
        // If we have iterated over travel days, return 0.
        if (currDay > days[days.length - 1]) {
            return 0;
        }
        // If we don't need to travel on this day, move on to next day.
        if (!isTravelNeeded.contains(currDay)) {
            return solve(dp, days, costs, currDay + 1,isTravelNeeded);
        }
        // If already calculated, return from here with the stored answer.
        if (dp[currDay] != -1) {
            return dp[currDay];
        }
        int oneDay = costs[0] + solve(dp, days, costs, currDay + 1,isTravelNeeded);
        int sevenDay = costs[1] + solve(dp, days, costs, currDay + 7,isTravelNeeded);
        int thirtyDay = costs[2] + solve(dp, days, costs, currDay + 30,isTravelNeeded);
        // Store the cost with the minimum of the three options.
        return dp[currDay] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
    }
}