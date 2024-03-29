package easy;

public class RichestCustomerWealth {
	public static void main(String[] args) {

		int[][] accounts = { {1, 5}, {7, 3}, {3, 5} };
		int result = maximumWealth(accounts);

		System.out.println(result);
	}

	static int maximumWealth(int[][] accounts) {
		int result = 0;

		for (int[] account : accounts) {
			int sum = 0;
			for (int i : account) {
				sum += i;
			}
			if (sum > result) {
				result = sum;
			}
		}

		return result;
	}
}

