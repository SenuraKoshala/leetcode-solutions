class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        boolean isDistinct = false;

        for(int num : nums){
            set.add(num);
        }

        if(nums.length != set.size()){
            isDistinct = true;
        }

        return isDistinct;
        
    }
}