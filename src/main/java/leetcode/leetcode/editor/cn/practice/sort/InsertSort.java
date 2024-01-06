package leetcode.leetcode.editor.cn.practice.sort;

public class InsertSort {

	/**
	 * 插入排序
	 * 要点：循环数组，每次循环从右边开始，依次和左边的元素对比，如果比左边的下，就插入进去。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 23, 3, 16, 3, 1};
		for (int i = 1; i < nums.length; i++) {
			int numi = nums[i];
			int indexj = i;
			for (int j = i; j > 0; j--) {
				if (numi < nums[j - 1]) {
					nums[j] = nums[j - 1];
					indexj = j - 1;
				} else {
					break;
				}

			}
			if (indexj != i) {
				nums[indexj] = numi;
			}
		}

		for (int num : nums) {
			System.out.println(num);
		}
	}

}
