class Solution {
    public int longestBalanced(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> set = new HashSet<>();
            int countEven=0,countOdd=0;
            int j=0;
            for(j=i;j<nums.length;j++){
                if(set.contains(nums[j])){
                    if(countEven==countOdd)
                        res=Math.max(res,j-i+1);
                    continue;
                }
                if(nums[j]%2==0)
                    countEven++;
                else
                    countOdd++;
                set.add(nums[j]);
                if(countEven==countOdd)
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
	
second solution: 	
    public int longestBalanced(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0)
                    evenSet.add(nums[j]);
                else
                    oddSet.add(nums[j]);

                if(evenSet.size()==oddSet.size())
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}