package leetcode.leetcode.editor.cn.practice.sort;

public class SelectSort {

	/**
	 * 选择排序
	 * 要点，每次和循环的第一个相比
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 23, 3, 16};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int num = nums[i];
				if (num > nums[j]) {
					int numj = nums[j];
					nums[i] = numj;
					nums[j] = num;
				}
			}
		}
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
