package net.mahtabalam.knapsack.dp;

public class Knapsack {

	private int numOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int totalValue;
	private int[] weights;
	private int[] values;

	public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weights = weights;
		this.values = values;
		this.knapsackTable = new int[numOfItems + 1][capacityOfKnapsack + 1];
	}
	
	public int solve() {
		for (int w = 0; w <= capacityOfKnapsack; w++) {
			knapsackTable[0][w] = 0;
		}
		for (int i = 0; i <= numOfItems; i++) {
			knapsackTable[i][0] = 0;
		}

		for (int i = 1; i <= numOfItems; i++) {
			for (int w = 1; w <= capacityOfKnapsack; w++) {

				int notTakingItem = knapsackTable[i - 1][w]; // not taking item i
				int takingItem = Integer.MIN_VALUE;

				if (weights[i - 1] <= w) {
					takingItem = values[i - 1] + knapsackTable[i - 1][w - weights[i - 1]];
				}

				knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
			}
		}
		totalValue = knapsackTable[numOfItems][capacityOfKnapsack];
		return totalValue;
	}

	public void showResult() {
		for (int n = numOfItems, w = capacityOfKnapsack; n > 0; n--) {
			if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("Included item: #" + n);
				w = w - weights[n - 1];
			}
		}
	}
}
