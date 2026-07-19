class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> m=new HashMap<>();
        boolean result=false;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Integer count:m.values()){
            if(count>1){
                result = true;
            }
        }
        return result;
    }
}