// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0; int y=0;
        int[][] dirs = new int[][] {{0,1}, {-1,0}, {0, -1}, {1,0}};
        int i=0;
        for(int j=0; j<instructions.length(); j++){
            char c = instructions.charAt(j);
            if(c == 'R'){
                i = (i+3)%4;
            } else if(c == 'L'){
                i = (i+1)%4;
            } else{
                x += dirs[i][0];
                y += dirs[i][1];
            }
        }
        return (x == 0 && y == 0) || (i != 0);
    }
}