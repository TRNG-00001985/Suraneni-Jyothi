package revday01;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
 
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	int num[]= {1,2,3,4};
    	System.out.println(s.hasDuplicate(num));
    }
    
}
