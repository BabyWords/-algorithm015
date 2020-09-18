package JumpGame;

/**
 * LeetCode 55
 */
public class Solution {
    //贪心算法,从后往前贪心
    public boolean canJump(int[] nums) {
        if(nums==null){
            return false;
        }
        int reach=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=reach){
                reach=i;
            }
        }
        return reach==0;
    }
}

