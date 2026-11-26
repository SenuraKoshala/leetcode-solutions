class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int missing = 0;

        for(int num : nums){
            if(num != missing){
                break;
            }
            else{
                missing++;
            }
        }

        return missing;
        
    }
}