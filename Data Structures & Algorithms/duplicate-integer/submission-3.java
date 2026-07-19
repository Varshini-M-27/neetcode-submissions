class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result=false;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
            else{
                result=true;
            }
        }
        return result;
    }
}