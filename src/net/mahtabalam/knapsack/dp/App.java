package net.mahtabalam.knapsack.dp;

public class App {
	public static void main(String[] args) {

//		int numOfItems = 3;
//		int capacityOfKnapsack = 5;
//
//		int[] weightOfItems = { 4, 2, 3 };
//		int[] valueOfItems = { 10, 4, 7 };
		
		int numOfItems = 5;
		int capacityOfKnapsack = 15;

		int[] weightOfItems = { 12, 2, 1, 1, 4 };
		int[] valueOfItems = { 4, 2, 2, 1, 10 };

		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, 
				                         weightOfItems, valueOfItems);
		int totalValue = knapsack.solve();
		System.out.println("Total Value : " + totalValue);
		knapsack.showResult();
	}
}
