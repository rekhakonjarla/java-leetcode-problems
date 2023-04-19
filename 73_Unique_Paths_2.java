73.Unique Paths 2

solution:-

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        boolean flag = false;
        for(int i=0;i<m;i++){
		   
            if(obstacleGrid[i][0]==1)
                flag = true;
		
            if(obstacleGrid[i][0]==0 && !flag)
                dp[i][0] = 1;
			
            else
                dp[i][0] = 0;
        }
        flag = false;
        for(int j=0;j<n;j++){
		 
            if(obstacleGrid[0][j]==1)
                flag = true;
            if(obstacleGrid[0][j]==0 && !flag)
                dp[0][j] = 1;
            else
                dp[0][j] = 0;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==0)
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}