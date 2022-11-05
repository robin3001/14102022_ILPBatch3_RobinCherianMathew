package com.assignment_basic_programming;

public class SumOf8 {

	
		    
		       static boolean chkPair(int Array[], int size, int x)
		        {



		           for (int i = 0; i < (size - 1); i++) {
		                for (int j = (i + 1); j < size; j++) {
		                    
		                    if (Array[i] + Array[j] == x) {
		                        System.out.println("Pair");
		                        System.out.println(Array[i]);
		                        System.out.println(Array[j]);
		                        i++;
		                        j++;
		                        if (Array[i] + Array[j] == x) {
		                            System.out.println("Pair");
		                            System.out.println(Array[i]);
		                            System.out.println(Array[j]);
		                            i++;
		                            j++;
		                         
		                        
		                        return true;
		                        
		                    }
		                    }}
		                }
		            
		     
		            return false;
		        }



		   public static void main(String[] args) {
		         
		             
		         int A[] = { 5, 2, 3, 6, 1 };
		            int x = 8;
		                int size = A.length;
		         
		                if (chkPair(A, size, x)) {
		                    System.out.println("These are the available pairs of 8");
		                }
		                else {
		                    System.out.println("No Pairs Available");
		                }
		            



		   }





	}


