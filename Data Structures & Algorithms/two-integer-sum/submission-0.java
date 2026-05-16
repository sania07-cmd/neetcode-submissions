class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int a[]={0,0};
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];

            if(map.containsKey(diff)&& map.get(diff)!=i)
            {
                 a[0]=map.get(diff);
                 a[1]=i;
                 //Arrays.sort(a);
            } 
            else 
                map.put(nums[i],i);
        }
        return a;
    }
}
