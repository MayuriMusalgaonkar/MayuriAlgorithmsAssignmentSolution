package com.learning.services;

public class StockStatus {
	public static int stockStatus(boolean[] stockPriccestatusArr, boolean b) {
		
		int count  = 0;
		for(int i =0; i< stockPriccestatusArr.length; i++) {
			 if(stockPriccestatusArr[i] == b){
				 count ++; 
			 }
		}
		return count;
	}
}
