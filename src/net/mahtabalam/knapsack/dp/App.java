package net.mahtabalam.knapsack.dp;

public class App {

	public static void main(String[] args) {

		int numOfItems = 3;
		int capacityOfKnapsack = 5;

		int[] weightOfItems = { 4, 2, 3 };
		int[] valueOfItems = { 10, 4, 7 };

		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weightOfItems, valueOfItems);
		int totalValue = knapsack.solve();
		System.out.println("Total Value : " + totalValue);

		knapsack.showResult();
	}
}
