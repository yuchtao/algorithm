package leetcode.leetcode.editor.cn.practice.sort;

public class SelectSort1 {

	/**
	 * 选择排序
	 * 要点，每次和循环的第一个相比，只比较小标
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 23, 3, 16};
		for (int i = 0; i < nums.length; i++) {
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					min = j;
				}
			}

			int num = nums[min];
			nums[min] = nums[i];
			nums[i] = num;
		}
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
