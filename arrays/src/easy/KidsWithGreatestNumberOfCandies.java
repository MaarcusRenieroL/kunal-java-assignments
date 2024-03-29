package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		List<Boolean> result = kidsWithCandies(candies, 3);
		System.out.println(result);
	}

	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int maxCandies = 0;

		for (int candy: candies) {
			if (candy > maxCandies) {
				maxCandies = candy;
			}
		}

		for (int candy: candies) {
			result.add(candy + extraCandies >= maxCandies);
		}

		return result;
	}
}
