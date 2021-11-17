public class centeredAverage{
	public int centeredAverage(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int sum = 0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
			sum += nums[i];
		}
		sum = sum - (max + min);
		return (sum /(nums.length - 2) );
	}
}
