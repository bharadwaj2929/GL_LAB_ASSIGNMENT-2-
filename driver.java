package com.java.lab;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Transaction_Array Size:");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter " + i + " values ");
			transactions[i] = sc.nextInt();
			
		}
		System.out.println("Enter the targets!");
		int target = sc.nextInt();
		PayMoney paymoney = new PayMoney();
		int number_of_days = paymoney.number_of_days(transactions, target);
		if(number_of_days == -1) {
			System.out.println("Target isn't achieved!");
		}
		else {
			System.out.println("Target is achievable in " + number_of_days);
		}
		sc.close();
	}
}
