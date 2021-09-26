package com.learning.services;

public class SortStockPrice {
	public void sort(double [] stockPrice,int left , int right,boolean flag) {
		if(left< right) {
			
			// mid
			int mid = (left + right)/2;
			sort(stockPrice, left, mid,flag);
			sort (stockPrice , mid+1, right,flag);
			merge(stockPrice ,left ,mid, right,flag);
		}
	}

	//for ascending order ----flag=false
	//for descending order ---flag=true
	private void merge(double[] stockPrice, int left, int mid, int right,boolean flag) {
	      int n1=mid -left +1;
	      int n2 =right - mid;
	      
	      double leftArray[ ]=new double [n1];
	      double rightArray[ ]=new double [n2];
	      
	      for(int i=0;i<n1;i++)
	    	  leftArray[i]=stockPrice[left + i];
	    
	      for(int i=0;i<n2;i++)
	    	  rightArray[i]= stockPrice[mid + 1 + i];
	      
	      int i=0 ,j=0;
	      
	      int k=left;
	      
	      while(i<n1 && j<n2) {
	    	  
	    	  if(leftArray[i]>=rightArray[j] && flag==true) {
	    		  stockPrice[k]=leftArray[i];
	    		  i++;
	    		 
	    	  }
	    	  else if(leftArray[i]<=rightArray[j] && flag==false) {
	    		  stockPrice[k]=leftArray[i];
	    		  i++;
	    		 
	    	  }
	    	  else {
	    		  stockPrice[k]=rightArray[j];
	    		  j++;
	    	  }
	    	  k++;
	      }
	      while(i<n1) {
	    	  stockPrice[k]=leftArray[i];
	    	  i++;
	    	  k++;
	    	  
	      }
	      while(j<n2) {
	    	  stockPrice[k]=rightArray[j];
	    	  j++;
	    	  k++;
	    	  
	      }
		
		
	}
}
