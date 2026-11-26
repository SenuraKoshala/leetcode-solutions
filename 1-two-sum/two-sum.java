class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indexes = null;

        for(int i = 0; i < nums.length - 1; i++){

            for(int j = i + 1; j < nums.length; j++){

                if((target-nums[i]-nums[j]) == 0){
                    indexes = new int[]{i, j};
                    
                }

            }
        }

        return indexes;
        
    }
}