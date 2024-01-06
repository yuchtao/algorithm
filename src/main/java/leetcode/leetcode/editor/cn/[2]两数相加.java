package leetcode.leetcode.editor.cn;

/**
 * 两数相加
 * 2023-11-28 09:17:21
 */
class AddTwoNumbers {
	public static void main(String[] args) {
		Solution solution = new AddTwoNumbers().new Solution();
		ListNode listNode11 = new ListNode(1);
		ListNode listNode12 = new ListNode(9);
		ListNode listNode13 = new ListNode(9);
		ListNode listNode14 = new ListNode(9);
		ListNode listNode15 = new ListNode(9);
		ListNode listNode16 = new ListNode(9);
		ListNode listNode17 = new ListNode(9);
		ListNode listNode18 = new ListNode(9);
		ListNode listNode19 = new ListNode(9);
		ListNode listNode20 = new ListNode(9);
		ListNode listNode21 = new ListNode(9);
		ListNode listNode22 = new ListNode(9);
		ListNode listNode23 = new ListNode(9);
		ListNode listNode24 = new ListNode(9);

		listNode11.next = listNode12;
		listNode12.next = listNode13;
		listNode13.next = listNode14;
		listNode14.next = listNode15;
		listNode15.next = listNode16;
		listNode16.next = listNode17;
		listNode17.next = listNode18;
		listNode18.next = listNode19;
		//listNode19.next = listNode20;

		listNode21.next= listNode22;
		listNode22.next= listNode23;
		listNode23.next= listNode24;


		//ListNode listNode11 = new ListNode(2);
		//ListNode listNode12 = new ListNode(4);
		//ListNode listNode13 = new ListNode(3);
		//ListNode listNode21 = new ListNode(5);
		//ListNode listNode22 = new ListNode(6);
		//ListNode listNode23 = new ListNode(4);
		//listNode12.next= listNode13;
		//listNode11.next= listNode12;
		//listNode22.next= listNode23;
		//listNode21.next= listNode22;
		solution.addTwoNumbers(listNode11, listNode21);
	}

	static class ListNode {
		ListNode next;

		int val;

		public ListNode() {
		}

		public ListNode(int val, ListNode next) {
			this.next = next;
			this.val = val;
		}

		public ListNode(int num) {
			this.val = num;
		}

	}

//leetcode submit region begin(Prohibit modification and deletion)

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode() {}
	 * ListNode(int val) { this.val = val; }
	 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode pre = new ListNode(0);
			ListNode cur = pre;
			int carry = 0;
			while (l1 != null || l2 != null) {
				int num1 = l1 != null ? l1.val : 0;
				int num2 = l2 != null ? l2.val : 0;

				int sum = num1 + num2 + carry;
				carry = sum / 10;
				int num = sum % 10;

				ListNode newNode = new ListNode(num);
				cur.next = newNode;
				cur = newNode;

				if (l1 != null && l1.next != null) {
					l1 = l1.next;
				}else{
					l1 = null;
				}

				if (l2 != null && l2.next != null) {
					l2 = l2.next;
				} else {
					l2 = null;
				}
			}

			if (carry > 0){
				cur.next = new ListNode(carry);
			}

			return pre.next;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)
}
	/*
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int length1 = 1;
		int length2 = 1;
		// l1链表的长度
		ListNode temp1 = l1;
		while (temp1.next != null) {
			temp1 = temp1.next;
			length1++;
		}
		//l2链表的长度
		ListNode temp2 = l2;
		while (temp2.next != null) {
			temp2 = temp2.next;
			length2++;
		}

		// 内存有溢出，所以会失败
		// l1的倒叙数字
		long sum1= 0;
		temp1 = l1;
		for (int i = length1; i > 0; i--) {
			long tempSum = temp1.val;
			for (int j = length1 -i; j >0; j--) {
				tempSum = tempSum * 10;
			}
			temp1 = temp1.next;
			sum1 = sum1 + tempSum;
		}

		// l2组成的倒叙数字
		long sum2= 0;
		temp2 = l2;
		for (int i = length2; i > 0; i--) {
			int tempSum = temp2.val;
			for (int j = length2 -i; j >0; j--) {
				tempSum = tempSum * 10;
			}
			temp2 = temp2.next;
			sum2 = sum2 + tempSum;
		}

		//倒叙数字的和
		long sum = sum1 + sum2;
		long tempSum = sum;
		int sumlength = 0;
		while (tempSum / 10 > 0){
			tempSum =  tempSum / 10;
			sumlength ++;
		}
		sumlength ++;

		//拆分数字，生成反向链表
		System.out.println(sumlength);
		ListNode result = null;
		for (int i = sumlength-1; i >= 0 ; i--) {
			long temp = sum;
			for (int j = i; j > 0; j--) {
				temp = temp/10;
			}
			int k = (int) (temp % 10);

			if (result == null) {
				result = new ListNode(k);
			} else {
				ListNode listNode = new ListNode(k);
				listNode.next = result;
				result = listNode;
			}
		}

		return result;
	}*/