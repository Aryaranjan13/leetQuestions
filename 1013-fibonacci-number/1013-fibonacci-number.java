class Solution {
  public int fib(int n) {
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    return solve(n, dp);
}

   private int solve(int n, int[] dp) {
     if (n <= 1) return n;
     if (dp[n] != -1) return dp[n];
     dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
     return dp[n];
}

        
        
        
        /*int [] dp = new int [n+1];
        Arrays.fill(dp, -1);
        if (n<=1) return n;

        if (dp[n]!=-1) return dp[n];
        dp[n] =fib(n-1)+fib(n-2);
            return dp[n];
        }*/
}
        
        
        
        /*if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
        }
    }*/
