public class Solution {
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0){
            return "";}
        int n = s.length();
        boolean [][]  dp = new boolean[n][n];
        String answer = "";
        for (int j = 0; j< n; j++){
            for (int i = 0; i < j+1; i++){
                dp[i][j] = i == j || (i+1 == j && s.charAt(i) == s.charAt(j)) || (i+1 < j && s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true);
                if (dp[i][j] && j-i+1 > answer.length()){
                    answer = s.substring(i, j+1);
                }
            }
        }
        
        return answer;
    }
    
    
}
