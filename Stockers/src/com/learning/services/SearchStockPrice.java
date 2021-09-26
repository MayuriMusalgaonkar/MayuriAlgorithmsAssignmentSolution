package com.learning.services;

public class SearchStockPrice {
		
		   public static int binarySearchImplementation(double[] currentStockPriceArr, int left, int right, double key){
				int serachElement=0;
				
				// for ascending order flag==false
				//for descending order flag==true
			    if(currentStockPriceArr[left]>currentStockPriceArr[right]) {
			    	serachElement=binarySearch(currentStockPriceArr, left, right, key,true);
			    }
			    else {
			    	serachElement=binarySearch(currentStockPriceArr, left, right, key,false);
			    }
		        
		        return serachElement;
	}
		   
		   public static int binarySearch(double[] currentStockPriceArr,int left, int right, double key,boolean flag) {
			  if(flag==false) {
			   if (right >= left) {
		            int mid = left + (right - left) / 2;
		  
		           
		            if (currentStockPriceArr[mid] == key)
		                return mid;
		  
		           
		            if (currentStockPriceArr[mid] > key)
		                return binarySearch(currentStockPriceArr, left, mid - 1, key,flag);
		  
		            return binarySearch(currentStockPriceArr, mid + 1, right, key,flag);
		        }
			  }
			  else if(flag==true) {
				  if (right >= left) {
			            int mid = left + (right - left) / 2;
			  
			            if (currentStockPriceArr[mid] == key)
			                return mid;
			  
			           
			            if (currentStockPriceArr[mid] <= key)
			                return binarySearch(currentStockPriceArr, left, mid - 1, key,flag);
			  
			           
			            return binarySearch(currentStockPriceArr, mid + 1, right, key,flag);
			        }
			  }
			   
			   return -1;
			   
		   }
}

