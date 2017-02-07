/*
greenfingers.java
@author Christopher Musitongo
31 January 2017
*/

import java.util.*;

public class greenfingers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int flowers = 0;
		double flowerCost = 5.20;

		int seeds = 0;
		double seedCost = 1.40;

		int trees = 0;
		double treesCost = 10.90;

		int shovels = 0;
		double shovelCost = 9.99;

		double total = 0;

		System.out.println("How many flowers would you like?");
		flowers = input.nextInt();

		System.out.println("How many seeds would you like?");
		seeds = input.nextInt();

		System.out.println("How many trees would you like?");
		trees = input.nextInt();

		System.out.println("How many shovels would you like?");
		shovels = input.nextInt();

		flowerCost = flowerCost * flowers;
		seedCost = seedCost * seeds;
		treesCost = treesCost * trees;
		shovelCost = shovelCost * shovels;

		total = flowerCost + seedCost + treesCost + shovelCost;

		System.out.println("The total is " + total + " euro");
	}
}