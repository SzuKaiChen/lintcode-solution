public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        int t = target.length();
        if (source == target || t == 0){
            return 0;
        }
        
        for (int i=0; i<source.length() - t + 1; i++){
            int j = 0;
            for(j = 0; j<t; j++){
                if (source.charAt(i+j) != target.charAt(j)){
                    break;
                }
            }
            if (j == t){
                return i;
            }
        }
        return -1;
    }
}

// could I use substring compare with target, making solution scope into just one loop?
