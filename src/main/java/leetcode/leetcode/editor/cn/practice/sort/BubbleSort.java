package leetcode.leetcode.editor.cn.practice.sort;

public class BubbleSort {

	/**
	 * 冒泡排序
	 * 要点：循环数组，每次循环从右边开始，依次和左边的元素对比，如果比左边的小，就互换位置。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 23, 3, 16};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j - 1] > nums[j]) {
					int num = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = num;
				}
			}
		}
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
