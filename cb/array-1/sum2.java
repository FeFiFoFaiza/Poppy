public class sum2 {
	public int sum2(int[] nums) {
		int ans = 0;
		if (nums.length == 0) {
			return ans;
		}
		if (nums.length < 2) {
			for (int i = 0; i < nums.length; i++){
			ans += nums[i];
			}
		} else {
			for (int i = 0; i < 2; i++){
			ans += nums[i];
			}
		}
  		return ans;
	}
}
