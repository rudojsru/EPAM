public class Test19 {
    public static void main(String[] args) {
        int x []={1,4,6,11,88};
        System.out.println(centeredAdverage(x));
    }

    public static int centeredAdverage (int[] nums){
        if(nums == null || nums.length <3){
            throw new IllegalArgumentException();
        }
        int min =nums[0];
        int max =nums[0];
        int sum =0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            if(nums[i] > max){
                max = nums[i];
            }else if (nums[i] <min ){
                min =nums [i];
            }
        }
      return (sum-(max+min))/(nums.length-2);
    }
}
