//kadan's algorithm for maximum subarray sum
public class maxsubarray {
    public static void kadans(int nums[]){
        // int cs =0;//currentsum
        // int ms = Integer.MIN_VALUE;//maximumsum
        int cs =nums[0];//currentsum
        int ms = nums[0];
        for(int i=0;i<nums.length;i++){
            cs =cs + nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("maxiumum subarray sum is :"+ms);
    }
    
    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadans(nums);
    }
}
