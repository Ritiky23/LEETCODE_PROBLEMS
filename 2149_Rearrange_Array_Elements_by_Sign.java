class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                b.add(nums[i]);
            }
            else{
                a.add(nums[i]);
            }
        }
        int k=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {
            nums[i]=a.get(k++);
            System.out.println(nums[i]);}
            else {
            nums[i]=b.get(m++);
             System.out.println(nums[i]);}
        }
        System.out.println(a);
        System.out.println(b);
        return nums;
    }
}