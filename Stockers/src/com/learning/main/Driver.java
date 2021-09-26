package com.learning.main;

import java.util.Scanner;

import com.learning.services.TakeInputs;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int noOfCompanies;
		
		System.out.println("Enter the no of companies");
		noOfCompanies = sc.nextInt();
		TakeInputs.getInputs(noOfCompanies, sc, choice);	
	}
}
