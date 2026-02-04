class Solution {
    public long maxSumTrionic(int[] nums) {
        int i;
      int length=nums.length;
        int sum=nums[0];
        int max=nums[0];
        for(i=0;i<length-1;i++)
        {
            if (nums[i]!=nums[i+1])
            {
                sum+=nums[i+1];
            }
        }
            System.out.println(sum);
            return sum;
    }
    }