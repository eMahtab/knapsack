package net.mahtabalam.knapsack.naive;

public class Knapsack {

	public static int solve(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
		// Base Case
		if (numOfItems == 0 || capacityOfKnapsack == 0)
			return 0;

		else if (weights[numOfItems - 1] > capacityOfKnapsack)
			return solve(numOfItems - 1, capacityOfKnapsack, weights, values);

		else
			return Math.max(solve(numOfItems - 1, capacityOfKnapsack, weights, values), values[numOfItems - 1]
					+ solve(numOfItems - 1, capacityOfKnapsack - weights[numOfItems - 1], weights, values));
	}
}
