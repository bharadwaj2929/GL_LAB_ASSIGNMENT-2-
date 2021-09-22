package com.java.lab;

public class PayMoney{
	public int number_of_days(int transactions[],int target){
		for(int i=0;i<transactions.length;i++){
			if(transactions[i] ==target || transactions[i]>target){
				return i+1;
			}	
			else{
				target -= transactions[i];
			}
		}
		return -1;
	}
}