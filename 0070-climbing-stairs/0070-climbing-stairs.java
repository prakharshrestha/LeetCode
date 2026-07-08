class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return solve(0,n,dp);
    }
    int solve(int i,int n,int[] dp){
        if(i==n)
        return 1;
        if(i>n)
        return 0;

        if(dp[i]!=-1)
        return dp[i];

        return dp[i]=solve(i+1,n,dp)+solve(i+2,n,dp);
    }
}