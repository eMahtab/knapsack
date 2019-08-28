package net.mahtabalam.knapsack.naive;

public class App {

	public static void main(String[] args) {

		int numOfItems = 3;
		int capacityOfKnapsack = 5;

		int[] weightOfItems = { 4, 2, 3 };
		int[] valueOfItems = { 10, 4, 7 };

		int totalValue = Knapsack.solve(numOfItems, capacityOfKnapsack, weightOfItems, valueOfItems);
		System.out.println("Total Value : " + totalValue);
	}
}
