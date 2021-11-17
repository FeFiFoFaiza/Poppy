public class maxEnd3{
	public int[] maxEnd3(int[] nums) {
 		int max;
		if (nums[0] > nums[2]){
			max = nums[0];
		} else {
			max = nums[2];
		}
		for (int i = 0; i < nums.length; i++){
			nums[i] = max;
		}
		return nums;
	}

}
